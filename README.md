# robolectric.shadows-supportv4
Clones of robolectric.shadows-supportv4 supports AndroidX

[![](https://jitpack.io/v/nimbl3/robolectric.shadows-supportv4.svg)](https://jitpack.io/#nimbl3/robolectric.shadows-supportv4)

`robolectric-base` supports androidx, but `robolectric:shadows-supportv4` still doesn’t https://github.com/robolectric/robolectric/issues/3985, so can not use `SupportFragmentController` or something else in `shadows-supportv4`. **While waiting for official support from robolectric team**,  this clones of `robolectric:shadows-supportv4` was made for supporting current tests using `robolectric:shadows-supportv4` works **without any changes** in test codes.

## usages
Instead of using `"org.robolectric:shadows-supportv4:$robolectric_version"`, change to `"com.github.nimbl3:robolectric.shadows-supportv4:LATEST_VERSION"`. Check `LATEST_VERSION` from JitPack badge.

## troubleshooter
- If still meet the error like this https://github.com/robolectric/robolectric/issues/3981. Try `Invalidate Cache and Restart` your Android Studio https://github.com/robolectric/robolectric/issues/3981#issuecomment-438199489, then re-run the test.
