package moe.caa.multilogin.core.command;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 储存权限的地方
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Permissions {
    public static final String COMMAND_TAB_COMPLETE = "command.multilogin.tab.complete";
    public static final String COMMAND_MULTI_LOGIN_RELOAD = "command.multilogin.reload";
    public static final String COMMAND_MULTI_LOGIN_ERASE_USERNAME = "command.multilogin.eraseusername";
    public static final String COMMAND_MULTI_LOGIN_WHITELIST_ADD = "command.multilogin.whitelist.add";
    public static final String COMMAND_MULTI_LOGIN_WHITELIST_REMOVE = "command.multilogin.whitelist.remove";

}