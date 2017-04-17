package cn.dreamtobe.xposed.crashpvp;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import static de.robv.android.xposed.XposedHelpers.findClass;

/**
 * Created by Jacksgong on 18/04/2017.
 * <p>
 * To crash the King of Glory.
 */

public class CrashPVP implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if (!lpparam.packageName.equals("com.tencent.tmgp.sgame")) return;

        if (BuildConfig.DEBUG) {
            XposedBridge.log("dreamtobe in king of glory!");
        }

        final Class<?> crashNotifyHandler = findClass("com.tsf4g.apollo.report.CrashNotifyHandler", lpparam.classLoader);
        findAndHookMethod(crashNotifyHandler, "Instance", new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                super.afterHookedMethod(param);
                param.setResult(null);
            }
        });
    }
}
