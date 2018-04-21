package wysobj;

import java.util.*;

public class SubStrOfWordsConcatenation
{
    public List<Integer> findSubstring(String s, String[] words)
    {
        List<Integer> indexes = new LinkedList<Integer>();
        if (s == null || words == null || words.length == 0)
        {
            return indexes;
        }
        WordsRecorder wr = new WordsRecorder(words);
        int wordLength = wr.getWordLength();
        if (wordLength == -1)
        {
            return indexes;
        }
        if (wordLength == 0)
        {
            for (int i = 0; i < s.length(); i++)
            {
                indexes.add(i);
            }
            return indexes;
        }
        for (int i = 0; i < wordLength; i++)
        {
            int start = i;
            int p = start;
            int steps = (s.length() - start) / wordLength;
            wr.reset();
            for (int st = 0; st < steps; st++)
            {
                String nextWord = s.substring(p, p + wordLength);
                boolean recordSuccess = wr.recordWord(nextWord);
                if (recordSuccess)
                {
                    p += wordLength;
                }
                else
                {
                    String removedWord = s.substring(start, start + wordLength);
                    while (start < p && !removedWord.equals(nextWord))
                    {
                        wr.unrecordWord(removedWord);
                        start += wordLength;
                        removedWord = s.substring(start, start + wordLength);
                    }
                    if (start <= p)
                    {
                        wr.recordWord(removedWord);
                    }
                    start += wordLength;
                    p += wordLength;
                }

                if (wr.getWordCount() == words.length)
                {
                    indexes.add(start);
                    String headWord = s.substring(start, start + wordLength);
                    wr.unrecordWord(headWord);
                    start += wordLength;
                }
            }
        }
        Collections.sort(indexes);
        return indexes;
    }



    private Map<String, Integer> buildFreq(String[] words)
    {
        Map<String, Integer> freqs = new HashMap<String, Integer>();
        for (String word : words)
        {
            if (!freqs.containsKey(word))
            {
                freqs.put(word, 0);
            }
            int freq = freqs.get(word) + 1;
            freqs.put(word, freq);
        }
        return freqs;
    }

    private static class WordsRecorder
    {
        private Map<String, Integer> backup;
        private Map<String, Integer> recorder;
        private int wordLength;
        private int wordCount;

        public WordsRecorder(String[] words)
        {
            this.recorder = new HashMap<String, Integer>();
            this.backup = new HashMap<String, Integer>();
            for (String word : words)
            {
                increaseWordCount(word, this.recorder);
                increaseWordCount(word, this.backup);
            }
            this.wordLength = measureLength(words);
        }

        public boolean recordWord(String word)
        {
            boolean success = decreaseWordCount(word);
            if (success)
            {
                this.wordCount += 1;
            }
            return success;
        }

        public void unrecordWord(String word)
        {
            increaseWordCount(word, this.recorder);
            this.wordCount -= 1;
        }

        public void reset()
        {
            for (Map.Entry<String, Integer> entry : this.backup.entrySet())
            {
                String k = entry.getKey();
                int v = entry.getValue();
                this.recorder.put(k, v);
            }
            this.wordCount = 0;
        }

        public int getWordLength()
        {
            return this.wordLength;
        }

        public int getWordCount()
        {
            return this.wordCount;
        }

        private void increaseWordCount(String word, Map<String, Integer> table)
        {
            if (!table.containsKey(word))
            {
                table.put(word, 0);
            }
            int oldCount = table.get(word);
            table.put(word, oldCount + 1);
        }

        private boolean decreaseWordCount(String word)
        {
            if (!this.recorder.containsKey(word) || this.recorder.get(word) == 0)
            {
                return false;
            }
            int oldCount = recorder.get(word);
            this.recorder.put(word, oldCount - 1);
            return true;
        }

        private int measureLength(String[] words)
        {
            int length = -1;
            for (String word : words)
            {
                if (length == -1)
                {
                    length = word.length();
                }
                else if (word.length() != length)
                {
                    return -1;
                }
            }
            return length;
        }
    }
}
