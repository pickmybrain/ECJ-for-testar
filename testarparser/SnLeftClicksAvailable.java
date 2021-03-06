package testarparser;

import java.util.ArrayList;
import java.util.List;

public class SnLeftClicksAvailable extends SelectorNodeBoolean {

	public SnLeftClicksAvailable(ArrayList<SelectorNode> children) {
		super(children);
	}

	@Override
	public boolean getValue(State state, List<Action> availableActions, History history) {
		return state.getAvailable(Action.ActionType.LEFTCLICK);
	}

}
