/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks;

/**
 * Top level info related to the mod.  Real important stuff here! ...and yes I know constants are typically all
 * upper-cased, but I felt like using lower-case for these.
 *
 * @author "oneandonlyflexo"
 */
public class ModInfo {

	public static final String modid = "barkbooks";
	public static final String name = "Bark Books";

	/**This gets replaced with a value from build.properties during the gradle build. */
	public static final String version = /*${gradle.mod_version}*/ "0.3";

	public static final String description = "A micro-mod that adds bark-covered books.";

}
