public class TreeObject implements Comparable<TreeObject> {

	public long Stream;
	public int freq;
	private long Value;
	public long seq;

	public TreeObject(long stream) {
		this.Stream = stream;
		this.freq = 1;
		this.Value = stream;
		this.seq = stream;
	}

	public TreeObject(long stream, int frequency) {
		this.Stream = stream;
		this.freq = frequency;
		this.Value = stream;
		this.seq = stream;
//		this.seq = dna;
	}

	public long getValue() {
		long value = Value;
		return value;
	}
	
	public int compareTo(TreeObject t) {
		if (Stream > t.getStream()) {
			return 1;
		}
		if (Stream < t.getStream()) {
			return -1;
		}
		else return 0;
	}
	
	public boolean equals(TreeObject t) {
		if (this.Stream == t.getStream()) {
			return true;
		}
		else return false;
	}

	public long getStream() {
		long strm = seq;
		return strm;
	}

	public int getFrequency() {

		return freq;
	}

	public long getObject() {

		return seq;
	}

}

