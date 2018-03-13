import java.util.ArrayList;

public class Main {

	ArrayList<Blocks> blockchain = new ArrayList<>(); 
	
	public static void main(String[] args) {

		String[] block1transactions={"A sends B 10 bitcoin","B sends C 5 bitcoin"};
		Blocks block1=new Blocks( 0, block1transactions);
		

		String[] block2transactions={"C sends B 10 bitcoin","B sends A 5 bitcoin"};
		Blocks block2 = new Blocks(block1.getBlockHash(),block2transactions);
		
		System.out.println("Hash of block 1:");
		System.out.println(block1.getBlockHash());
		System.out.println("Hash of block 2:");
		System.out.println(block2.getBlockHash());
	}

}
