/*
 * Copyright (C) 2011 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * This file is part of AdAway.
 * 
 * AdAway is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AdAway is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AdAway.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.adaway.utils;

public class Constants {
    public static final String TAG = "AdAway";

    public final static String PREFS_NAME = "preferences";

    public static final String LOCALHOST_IPv4 = "127.0.0.1";
    public static final String LOCALHOST_HOSTNAME = "localhost";
    public static final String DOWNLOADED_HOSTS_FILENAME = "hosts_downloaded";
    public static final String HOSTS_FILENAME = "hosts";
    public static final String LINE_SEPERATOR = System.getProperty("line.separator");
    public static final String COMMAND_COPY = "cp -f";
    public static final String COMMAND_CHOWN = "chown 0:0";
    public static final String COMMAND_CHMOD_644 = "chmod 644";
    public static final String COMMAND_CHMOD_666 = "chmod 666";
    public static final String COMMAND_LN = "ln -s";
    public static final String COMMAND_RM = "rm -f";
    public static final String ANDROID_SYSTEM_ETC_PATH = "/system/etc";
    public static final String ANDROID_DATA_DATA_PATH = "/data/data";

    public static final String HEADER1 = "# This hosts file is generated by AdAway.";
    public static final String HEADER2 = "# Please do not modify it directly, it will be overwritten when AdAway is applied again.";
    public static final String HEADER_COMMENT = "# The following lines are comments from the downloaded hosts files:";
}
