package testarparser;

import java.util.ArrayList;


public abstract class SelectorNode {
	ArrayList<SelectorNode> children;
	
	public SelectorNode(ArrayList<SelectorNode> children){
		this.children = children;
	}
	
	public void print(int level){
		for (int i = 0; i < level; i++){
			System.out.print("-");
		}
		System.out.println(this.getClass().getSimpleName());
		for (SelectorNode c : children){
			c.print(level + 1);
		}
	}
	
}
