import java.util.Arrays;

public class Blocks {
	
	private int previousHash;
	private String[] transactions;
	
	private int blockHash;
	
	public Blocks(int previousHash, String[] transactions) {
		this.previousHash = previousHash;
		this.transactions = transactions;
		
		Object[] contents={Arrays.hashCode(transactions),previousHash};
		this.blockHash=Arrays.hashCode(contents);
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public String[] gettransactions() {
		return transactions;
	}

	public int getBlockHash() {
		return blockHash;
	}

	
}
