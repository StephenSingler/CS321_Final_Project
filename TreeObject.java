public class TreeObject {

    private int freq;
    private long key;

    public TreeObject(long key, int freq) {
        this.key = key;
        this.freq = freq;
    }

    public TreeObject(long key) {
        this.key = key;
        this.freq = 1;
    }

    public Long getKey() {
        return this.key;
    }

    public int getFreq() {
        return this.freq;
    }

    public void increaseFreq() {
        freq++;
    }

    public int compareTo(TreeObject obj) {
        if (key < obj.key)
            return -1;
        if (key > obj.key)
            return 1;
        else
            return 0;
    }

}