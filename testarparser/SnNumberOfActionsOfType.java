package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnNumberOfActionsOfType extends SelectorNodeNumber {
	SelectorNodeActiontype child1;

	public SnNumberOfActionsOfType(ArrayList<SelectorNode> children) {
		super(children);
		child1 = (SelectorNodeActiontype)children.get(0);
	}

	@Override
	public int getValue(State state, List<Action> availableActions, History history) {
		
		return state.getNumberOfActions(child1.getActiontype(state, availableActions, history));
	}

}
