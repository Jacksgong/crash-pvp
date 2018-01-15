# Crash PVP(King of Glory)

![][crash_pvp_svg]
![][xposed_module_svg]

安装这个Xposed模块以后，一启动王者荣耀立马就会Crash(奔溃)，来避免玩该游戏。你也可以通过安装[wechat hunter](https://github.com/Jacksgong/wechat-hunter)这个模块隐藏游戏中心在微信中的入口。

> 已经在[Xposed Module Repository](http://repo.xposed.info/module/cn.dreamtobe.xposed.crashpvp)中发布(注：仅仅安装该APK是没有作用的，需要先安装好Xposed框架，Xposed模块是运行在Xposed上的)。

## 大概原理:

#### 找到王者荣耀入口

![](https://github.com/Jacksgong/crash-pvp/raw/master/arts/manifest.png)

#### 找到Crash的Case

![](https://github.com/Jacksgong/crash-pvp/raw/master/arts/launch-activity.png)

#### 实现代码

- [feat: implement the logic to crash king of glory game](https://github.com/Jacksgong/crash-pvp/commit/323c324d12bcaca27c64135e38f4659f3e6d7f3a)

![](https://github.com/Jacksgong/crash-pvp/raw/master/arts/coding.png)

## LICENSE

```
Copyright (C) 2017 Jacksgong(blog.dreamtobe.cn)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

[xposed_module_svg]: https://img.shields.io/badge/Xposed-Module-orange.svg
[crash_pvp_svg]: https://img.shields.io/badge/Crash-PVP-green.svg
