package wysobj;

public class ValidNumber
{
    // worst problem ever meet
    public boolean isNumber(String s)
    {
        if (s == null)
        {
            return false;
        }
        s = s.trim();
        ValidNumberStateMachine vnsm = new ValidNumberStateMachine(s);
        return vnsm.isValid();
    }

    private static class ValidNumberStateMachine
    {
        char[] sequence;
        State state;

        public ValidNumberStateMachine(String s)
        {
            s = s.trim();
            this.sequence = s.toCharArray();
            this.state = State.INIT;
        }

        public boolean isValid()
        {
            for (char c : this.sequence)
            {
                dispatch(c);
                if (this.state == State.INVALID)
                {
                    return false;
                }
            }
            return isValidFinishState();
        }

        private void dispatch(char c)
        {
            switch (this.state)
            {
                case INIT : changeStateFromInit(c);
                    break;
                case SIGN : changeStateFromSIGN(c);
                    break;
                case INTEGER : changeStateFromInteger(c);
                    break;
                case DECIMAL : changeStateFromDecimal(c);
                    break;
                case LEADING_DECIMAL : changeStateFromLeadingDecimal(c);
                    break;
                case E : changeStateFromE(c);
                    break;
                case E_SIGN : changeStateFromESign(c);
                    break;
                case E_SEEN : changeStateFromESeen(c);
                    break;
                case INVALID :
                    break;
            }
        }

        private void changeStateFromInit(char c)
        {
            if (isSign(c))
            {
                this.state = State.SIGN;
            }
            else if (isDigit(c))
            {
                this.state = State.INTEGER;
            }
            else if (c == '.')
            {
                this.state = State.LEADING_DECIMAL;
            }
            else
            {
                this.state = State.INVALID;
            }
        }

        private void changeStateFromSIGN(char c)
        {
            if (isDigit(c))
            {
                this.state = State.INTEGER;
            }
            else if (c == '.')
            {
                this.state = State.LEADING_DECIMAL;
            }
            else
            {
                this.state = State.INVALID;
            }
        }

        private void changeStateFromInteger(char c)
        {
            if (c == '.')
            {
                this.state = State.DECIMAL;
            }
            else if (c == 'e')
            {
                this.state = State.E;
            }
            else if (!isDigit(c))
            {
                this.state = State.INVALID;
            }
        }

        private void changeStateFromDecimal(char c)
        {
            if (c == 'e')
            {
                this.state = State.E;
            }
            else if (!isDigit(c))
            {
                this.state = State.INVALID;
            }
        }

        private void changeStateFromLeadingDecimal(char c)
        {
           if (isDigit(c))
            {
                this.state = State.DECIMAL;
            }
            else
            {
                this.state = State.INVALID;
            }
        }

        private void changeStateFromE(char c)
        {
            if (isDigit(c))
            {
                this.state = State.E_SEEN;
            }
            else if (isSign(c))
            {
                this.state = State.E_SIGN;
            }
            else
            {
                this.state = State.INVALID;
            }
        }

        private void changeStateFromESign(char c)
        {
            if (isDigit(c))
            {
                this.state = State.E_SEEN;
            }
            else
            {
                this.state = State.INVALID;
            }
        }

        private void changeStateFromESeen(char c)
        {
            if (!isDigit(c))
            {
                this.state = State.INVALID;
            }
        }

        private boolean isSign(char c)
        {
            return c == '-' || c == '+';
        }

        private boolean isDigit(char c)
        {
            return c >= '0' && c <= '9';
        }

        private boolean isValidFinishState()
        {
            return this.state != State.INIT &&
                   this.state != State.E &&
                   this.state != State.SIGN &&
                   this.state != State.E_SIGN &&
                   this.state != State.LEADING_DECIMAL;
        }

        private enum State
        {
            INIT, SIGN, INTEGER, LEADING_DECIMAL, DECIMAL, E, E_SIGN, E_SEEN, INVALID;
        }
    }
}
