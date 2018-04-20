package testarparser;

import java.util.ArrayList;
import java.util.List;

public abstract class SelectorNodeNumber extends SelectorNode{
	public SelectorNodeNumber(ArrayList<SelectorNode> children) {
		super(children);
		
	}

	public abstract int getValue(State state, List<Action> previousActions, History history);
}
