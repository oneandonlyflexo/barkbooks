/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.config;

import org.apache.logging.log4j.Level;

import net.minecraftforge.common.config.Configuration;
import one.flexo.barkbooks.BarkBooks;
import one.flexo.barkbooks.proxy.CommonProxy;

public class Config {

	static final String CATEGORY_GENERAL = "general";
	static final String CATEGORY_DIMENSION = "dimensions";

	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {

			//Add in configs here when we got 'em!

		} catch (Exception e1) {
			BarkBooks.logger.log(Level.ERROR, "Problem loading config file!", e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

	static void initGeneralConfig(Configuration cfg) {

	}

}
