package alephinfinity1.forgeblock.misc.capability.skills;

import java.util.concurrent.Callable;

public class SkillsFactory implements Callable<ISkills> {

	@Override
	public ISkills call() throws Exception {
		return new Skills();
	}

}
