package com.MatofSteel1.soulglassmod.utility;

import com.MatofSteel1.soulglassmod.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper {

    public static void log(Level level, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, level, String.valueOf(object));
    }

    public static void off (Object object) { log(Level.OFF, object); }
    public static void fatal (Object object) { log(Level.FATAL, object); }
    public static void error (Object object) { log(Level.ERROR, object); }
    public static void warn (Object object) { log(Level.WARN, object); }
    public static void info (Object object) { log(Level.INFO, object); }
    public static void debug (Object object) { log(Level.DEBUG, object); }
    public static void trace (Object object) { log(Level.TRACE, object); }
    public static void all (Object object) { log(Level.ALL, object); }
}
