package cn.dreamtobe.xposed.crashpvp;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by Jacksgong on 18/04/2017.
 * <p>
 * To crash the King of Glory.
 */

public class CrashPVP implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
    }
}
