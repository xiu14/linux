.class public final synthetic La2/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La2/e;->h:I

    .line 2
    .line 3
    iput-object p2, p0, La2/e;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    iget v0, v1, La2/e;->h:I

    const/16 v2, 0x17

    sget-object v3, Lp4/k;->a:Lp4/k;

    const/4 v4, 0x0

    const/4 v5, 0x1

    iget-object v6, v1, La2/e;->i:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v6, Lw1/h;

    .line 1
    invoke-interface {v6}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/p;

    move-result-object v0

    new-instance v2, Lw1/c;

    invoke-direct {v2, v4, v6}, Lw1/c;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroidx/lifecycle/p;->a(Landroidx/lifecycle/v;)V

    return-object v3

    .line 2
    :pswitch_0
    check-cast v6, Lu2/c;

    const-string v0, ":memory:"

    .line 3
    invoke-virtual {v6, v0}, Lu2/c;->d(Ljava/lang/String;)Ly1/a;

    move-result-object v0

    return-object v0

    .line 4
    :pswitch_1
    check-cast v6, Lm2/r;

    .line 5
    iget-object v0, v6, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v2, :cond_1

    .line 6
    iget-object v2, v6, Lm2/r;->a:Landroid/content/Context;

    .line 7
    sget-object v7, Lp2/d;->m:Ljava/lang/String;

    const/16 v7, 0x22

    if-lt v5, v7, :cond_0

    .line 8
    invoke-static {v2}, Lp2/a;->b(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    move-result-object v5

    .line 9
    invoke-virtual {v5}, Landroid/app/job/JobScheduler;->cancelAll()V

    .line 10
    :cond_0
    const-string v5, "jobscheduler"

    invoke-virtual {v2, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/job/JobScheduler;

    .line 11
    invoke-static {v2, v5}, Lp2/d;->f(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 12
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    :goto_0
    if-ge v4, v7, :cond_1

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v4, v4, 0x1

    check-cast v8, Landroid/app/job/JobInfo;

    .line 14
    invoke-virtual {v8}, Landroid/app/job/JobInfo;->getId()I

    move-result v8

    invoke-static {v5, v8}, Lp2/d;->c(Landroid/app/job/JobScheduler;I)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    move-result-object v2

    .line 16
    iget-object v4, v2, Lu2/s;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 17
    invoke-virtual {v4}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 18
    iget-object v2, v2, Lu2/s;->l:Lu2/h;

    invoke-virtual {v2}, Landroidx/room/a1;->a()Lz1/i;

    move-result-object v5

    .line 19
    :try_start_0
    invoke-virtual {v4}, Landroidx/room/r0;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    invoke-interface {v5}, Lz1/i;->y()I

    .line 21
    invoke-virtual {v4}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    :try_start_2
    invoke-virtual {v4}, Landroidx/room/r0;->endTransaction()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    invoke-virtual {v2, v5}, Landroidx/room/a1;->c(Lz1/i;)V

    .line 24
    iget-object v2, v6, Lm2/r;->b:Ll2/a;

    .line 25
    iget-object v4, v6, Lm2/r;->e:Ljava/util/List;

    .line 26
    invoke-static {v2, v0, v4}, Lm2/i;->b(Ll2/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-object v3

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 27
    :try_start_3
    invoke-virtual {v4}, Landroidx/room/r0;->endTransaction()V

    .line 28
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 29
    :goto_1
    invoke-virtual {v2, v5}, Landroidx/room/a1;->c(Lz1/i;)V

    .line 30
    throw v0

    .line 31
    :pswitch_2
    check-cast v6, Lm2/o;

    .line 32
    sget-object v0, Lv2/b;->a:Ljava/lang/String;

    .line 33
    iget-object v0, v6, Lm2/o;->a:Lm2/r;

    .line 34
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 35
    iget-object v7, v6, Lm2/o;->c:Ljava/util/ArrayList;

    .line 36
    invoke-interface {v2, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 37
    invoke-static {v6}, Lm2/o;->T(Lm2/o;)Ljava/util/HashSet;

    move-result-object v7

    .line 38
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 39
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    .line 40
    :cond_3
    iget-object v5, v6, Lm2/o;->c:Ljava/util/ArrayList;

    .line 41
    invoke-interface {v2, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    :goto_2
    if-nez v4, :cond_5

    .line 42
    iget-object v2, v0, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    iget-object v4, v0, Lm2/r;->b:Ll2/a;

    .line 43
    invoke-virtual {v2}, Landroidx/room/r0;->beginTransaction()V

    .line 44
    :try_start_4
    invoke-static {v2, v4, v6}, Lv2/h;->b(Landroidx/work/impl/WorkDatabase;Ll2/a;Lm2/o;)V

    .line 45
    invoke-static {v6}, Lv2/b;->a(Lm2/o;)Z

    move-result v5

    .line 46
    invoke-virtual {v2}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 47
    invoke-virtual {v2}, Landroidx/room/r0;->endTransaction()V

    if-eqz v5, :cond_4

    .line 48
    iget-object v2, v0, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 49
    iget-object v0, v0, Lm2/r;->e:Ljava/util/List;

    .line 50
    invoke-static {v4, v2, v0}, Lm2/i;->b(Ll2/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_4
    return-object v3

    :catchall_2
    move-exception v0

    .line 51
    invoke-virtual {v2}, Landroidx/room/r0;->endTransaction()V

    .line 52
    throw v0

    .line 53
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkContinuation has cycles ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :pswitch_3
    check-cast v6, Ldev/jahir/frames/muzei/FramesArtWorker;

    invoke-static {v6}, Ldev/jahir/frames/muzei/FramesArtWorker;->b(Ldev/jahir/frames/muzei/FramesArtWorker;)Landroidx/lifecycle/y;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v6, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;

    invoke-static {v6}, Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;->j(Ldev/jahir/frames/ui/fragments/viewer/DetailsFragment;)Ldev/jahir/frames/ui/adapters/WallpaperDetailsAdapter;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v6, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;

    invoke-static {v6}, Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;->i(Ldev/jahir/frames/ui/fragments/base/BaseFramesFragment;)Lp4/k;

    move-result-object v0

    return-object v0

    :pswitch_6
    check-cast v6, Ldev/jahir/frames/ui/fragments/base/BaseBottomSheet;

    invoke-static {v6}, Ldev/jahir/frames/ui/fragments/base/BaseBottomSheet;->h(Ldev/jahir/frames/ui/fragments/base/BaseBottomSheet;)Lp4/k;

    move-result-object v0

    return-object v0

    :pswitch_7
    check-cast v6, Ldev/jahir/frames/ui/fragments/WallpapersFragment;

    invoke-static {v6}, Ldev/jahir/frames/ui/fragments/WallpapersFragment;->n(Ldev/jahir/frames/ui/fragments/WallpapersFragment;)Ldev/jahir/frames/ui/adapters/WallpapersAdapter;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v6, Ldev/jahir/frames/ui/fragments/SettingsFragment;

    invoke-static {v6}, Ldev/jahir/frames/ui/fragments/SettingsFragment;->o(Ldev/jahir/frames/ui/fragments/SettingsFragment;)Lp4/k;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v6, Ldev/jahir/frames/ui/fragments/CollectionsFragment;

    invoke-static {v6}, Ldev/jahir/frames/ui/fragments/CollectionsFragment;->m(Ldev/jahir/frames/ui/fragments/CollectionsFragment;)Ldev/jahir/frames/ui/adapters/CollectionsAdapter;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v6, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;

    invoke-static {v6}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->o(Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;)Ll2/d0;

    move-result-object v0

    return-object v0

    :pswitch_b
    check-cast v6, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;

    invoke-static {v6}, Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;->e(Ldev/jahir/frames/ui/activities/base/BaseThemedActivity;)Lp4/k;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v6, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    invoke-static {v6}, Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;->B(Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;)Lp4/k;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v6, Ldev/jahir/frames/ui/activities/base/BaseChangelogDialogActivity;

    invoke-static {v6}, Ldev/jahir/frames/ui/activities/base/BaseChangelogDialogActivity;->u(Ldev/jahir/frames/ui/activities/base/BaseChangelogDialogActivity;)Landroidx/appcompat/app/r;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v6, Ldev/jahir/frames/ui/activities/MuzeiSettingsActivity;

    invoke-static {v6}, Ldev/jahir/frames/ui/activities/MuzeiSettingsActivity;->l(Ldev/jahir/frames/ui/activities/MuzeiSettingsActivity;)Ldev/jahir/frames/data/Preferences;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v6, Ldev/jahir/frames/ui/activities/AboutActivity;

    invoke-static {v6}, Ldev/jahir/frames/ui/activities/AboutActivity;->f(Ldev/jahir/frames/ui/activities/AboutActivity;)Ldev/jahir/frames/data/Preferences;

    move-result-object v0

    return-object v0

    :pswitch_10
    check-cast v6, Ldev/jahir/blueprint/ui/fragments/RequestFragment;

    invoke-static {v6}, Ldev/jahir/blueprint/ui/fragments/RequestFragment;->n(Ldev/jahir/blueprint/ui/fragments/RequestFragment;)Ldev/jahir/blueprint/ui/adapters/RequestAppsAdapter;

    move-result-object v0

    return-object v0

    :pswitch_11
    check-cast v6, Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;

    invoke-static {v6}, Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;->m(Ldev/jahir/blueprint/ui/fragments/IconsCategoriesFragment;)Ldev/jahir/blueprint/ui/adapters/IconsCategoriesAdapter;

    move-result-object v0

    return-object v0

    :pswitch_12
    check-cast v6, Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    invoke-static {v6}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->g(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    move-result-object v0

    return-object v0

    :pswitch_13
    check-cast v6, Ldev/jahir/blueprint/ui/fragments/ApplyFragment;

    invoke-static {v6}, Ldev/jahir/blueprint/ui/fragments/ApplyFragment;->m(Ldev/jahir/blueprint/ui/fragments/ApplyFragment;)Ldev/jahir/blueprint/ui/adapters/LaunchersAdapter;

    move-result-object v0

    return-object v0

    :pswitch_14
    check-cast v6, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;

    invoke-static {v6}, Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;->a(Ldev/jahir/blueprint/data/viewmodels/IconsCategoriesViewModel;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_15
    check-cast v6, Landroidx/room/a1;

    .line 55
    invoke-virtual {v6}, Landroidx/room/a1;->b()Ljava/lang/String;

    move-result-object v0

    .line 56
    iget-object v2, v6, Landroidx/room/a1;->a:Landroidx/room/r0;

    invoke-virtual {v2, v0}, Landroidx/room/r0;->compileStatement(Ljava/lang/String;)Lz1/i;

    move-result-object v0

    return-object v0

    .line 57
    :pswitch_16
    check-cast v6, Ljava/util/concurrent/Callable;

    .line 58
    invoke-interface {v6}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 59
    :pswitch_17
    check-cast v6, Ljava/lang/Runnable;

    .line 60
    invoke-interface {v6}, Ljava/lang/Runnable;->run()V

    return-object v3

    .line 61
    :pswitch_18
    check-cast v6, Landroidx/lifecycle/e1;

    .line 62
    invoke-static {v6}, Landroidx/lifecycle/t0;->f(Landroidx/lifecycle/e1;)Landroidx/lifecycle/v0;

    move-result-object v0

    return-object v0

    .line 63
    :pswitch_19
    check-cast v6, La3/f;

    .line 64
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 65
    iget-object v2, v6, La3/f;->b:Lj3/n;

    .line 66
    new-instance v3, La3/c;

    iget-object v7, v6, La3/f;->a:La3/o;

    invoke-virtual {v7}, La3/o;->b()Lj6/k;

    move-result-object v8

    .line 67
    invoke-direct {v3, v8}, La3/c;-><init>(Lj6/i0;)V

    .line 68
    invoke-static {v3}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    move-result-object v8

    .line 69
    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 70
    new-instance v9, Lj6/a0;

    invoke-direct {v9, v8}, Lj6/a0;-><init>(Lj6/k;)V

    invoke-static {v9}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    move-result-object v9

    .line 71
    new-instance v10, Lj6/g;

    invoke-direct {v10, v9, v5}, Lj6/g;-><init>(Lj6/k;I)V

    const/4 v9, 0x0

    .line 72
    invoke-static {v10, v9, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 73
    iget-object v10, v3, La3/c;->j:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Exception;

    if-nez v10, :cond_30

    .line 74
    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 75
    sget-object v10, La3/l;->a:Landroid/graphics/Paint;

    iget-object v10, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    iget-object v6, v6, La3/f;->d:La3/k;

    .line 76
    sget-object v11, La3/m;->a:Ljava/util/Set;

    .line 77
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_9

    const/4 v13, 0x2

    if-eq v6, v5, :cond_7

    if-ne v6, v13, :cond_6

    goto :goto_3

    :cond_6
    new-instance v0, Landroidx/fragment/app/i0;

    .line 78
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 79
    throw v0

    :cond_7
    if-eqz v10, :cond_9

    .line 80
    sget-object v6, La3/m;->a:Ljava/util/Set;

    invoke-interface {v6, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 81
    :goto_3
    new-instance v6, Ld1/g;

    new-instance v10, La3/j;

    .line 82
    new-instance v14, Lj6/a0;

    invoke-direct {v14, v8}, Lj6/a0;-><init>(Lj6/k;)V

    invoke-static {v14}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    move-result-object v14

    .line 83
    new-instance v15, Lj6/g;

    invoke-direct {v15, v14, v5}, Lj6/g;-><init>(Lj6/k;I)V

    .line 84
    invoke-direct {v10, v15}, La3/j;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v6, v10}, Ld1/g;-><init>(Ljava/io/InputStream;)V

    .line 85
    new-instance v10, La3/i;

    .line 86
    invoke-virtual {v6}, Ld1/g;->c()I

    move-result v14

    if-eq v14, v13, :cond_8

    const/4 v13, 0x7

    if-eq v14, v13, :cond_8

    const/4 v13, 0x4

    if-eq v14, v13, :cond_8

    const/4 v13, 0x5

    if-eq v14, v13, :cond_8

    const/4 v13, 0x0

    goto :goto_4

    :cond_8
    const/4 v13, 0x1

    .line 87
    :goto_4
    invoke-virtual {v6}, Ld1/g;->c()I

    move-result v6

    packed-switch v6, :pswitch_data_1

    const/4 v6, 0x0

    goto :goto_5

    :pswitch_1a
    const/16 v6, 0x5a

    goto :goto_5

    :pswitch_1b
    const/16 v6, 0x10e

    goto :goto_5

    :pswitch_1c
    const/16 v6, 0xb4

    .line 88
    :goto_5
    invoke-direct {v10, v6, v13}, La3/i;-><init>(IZ)V

    goto :goto_6

    .line 89
    :cond_9
    sget-object v10, La3/i;->c:La3/i;

    .line 90
    :goto_6
    iget v6, v10, La3/i;->b:I

    iget-boolean v10, v10, La3/i;->a:Z

    iget-object v13, v3, La3/c;->j:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Exception;

    if-nez v13, :cond_2f

    .line 91
    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 92
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x1a

    if-lt v13, v14, :cond_a

    .line 93
    iget-object v15, v2, Lj3/n;->c:Landroid/graphics/ColorSpace;

    if-eqz v15, :cond_a

    .line 94
    invoke-static {v0, v15}, La3/b;->v(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 95
    :cond_a
    iget-boolean v15, v2, Lj3/n;->h:Z

    iget-object v9, v2, Lj3/n;->a:Landroid/content/Context;

    iget-object v4, v2, Lj3/n;->d:Lk3/h;

    .line 96
    iput-boolean v15, v0, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 97
    iget-object v15, v2, Lj3/n;->b:Landroid/graphics/Bitmap$Config;

    if-nez v10, :cond_b

    if-lez v6, :cond_d

    :cond_b
    if-eqz v15, :cond_c

    .line 98
    invoke-static {v15}, La/a;->I(Landroid/graphics/Bitmap$Config;)Z

    move-result v16

    if-eqz v16, :cond_d

    :cond_c
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 99
    :cond_d
    iget-boolean v11, v2, Lj3/n;->g:Z

    if-eqz v11, :cond_e

    .line 100
    sget-object v11, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-ne v15, v11, :cond_e

    iget-object v11, v0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string v12, "image/jpeg"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    .line 101
    sget-object v15, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :cond_e
    if-lt v13, v14, :cond_f

    .line 102
    invoke-static {v0}, La3/b;->g(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    move-result-object v11

    invoke-static {}, La3/b;->f()Landroid/graphics/Bitmap$Config;

    move-result-object v12

    if-ne v11, v12, :cond_f

    invoke-static {}, La3/b;->C()Landroid/graphics/Bitmap$Config;

    move-result-object v11

    if-eq v15, v11, :cond_f

    .line 103
    invoke-static {}, La3/b;->f()Landroid/graphics/Bitmap$Config;

    move-result-object v15

    .line 104
    :cond_f
    iput-object v15, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 105
    invoke-virtual {v7}, La3/o;->a()Le6/d;

    move-result-object v7

    .line 106
    instance-of v11, v7, La3/p;

    if-eqz v11, :cond_11

    .line 107
    sget-object v11, Lk3/h;->c:Lk3/h;

    invoke-static {v4, v11}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_11

    .line 108
    iput v5, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 109
    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 110
    check-cast v7, La3/p;

    .line 111
    iget v2, v7, La3/p;->g:I

    .line 112
    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 113
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    move/from16 v18, v6

    :cond_10
    :goto_7
    const/4 v12, 0x1

    goto/16 :goto_11

    .line 114
    :cond_11
    iget v7, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v7, :cond_12

    iget v11, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-gtz v11, :cond_13

    :cond_12
    move/from16 v18, v6

    const/4 v12, 0x1

    goto/16 :goto_10

    :cond_13
    const/16 v12, 0x5a

    const/16 v13, 0x10e

    if-eq v6, v12, :cond_15

    if-ne v6, v13, :cond_14

    goto :goto_8

    :cond_14
    move v14, v7

    goto :goto_9

    :cond_15
    :goto_8
    move v14, v11

    :goto_9
    if-eq v6, v12, :cond_17

    if-ne v6, v13, :cond_16

    goto :goto_a

    :cond_16
    move v7, v11

    .line 115
    :cond_17
    :goto_a
    iget-object v11, v2, Lj3/n;->e:Lk3/g;

    .line 116
    sget-object v12, Lk3/h;->c:Lk3/h;

    invoke-static {v4, v12}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_18

    move v13, v14

    goto :goto_b

    .line 117
    :cond_18
    iget-object v13, v4, Lk3/h;->a:Le6/d;

    .line 118
    invoke-static {v13, v11}, Lo3/e;->e(Le6/d;Lk3/g;)I

    move-result v13

    .line 119
    :goto_b
    invoke-static {v4, v12}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_19

    move v4, v7

    goto :goto_c

    .line 120
    :cond_19
    iget-object v4, v4, Lk3/h;->b:Le6/d;

    .line 121
    invoke-static {v4, v11}, Lo3/e;->e(Le6/d;Lk3/g;)I

    move-result v4

    .line 122
    :goto_c
    div-int v12, v14, v13

    invoke-static {v12}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v12

    .line 123
    div-int v15, v7, v4

    invoke-static {v15}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v15

    .line 124
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_1b

    if-ne v1, v5, :cond_1a

    .line 125
    invoke-static {v12, v15}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_d

    .line 126
    :cond_1a
    new-instance v0, Landroidx/fragment/app/i0;

    .line 127
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 128
    throw v0

    .line 129
    :cond_1b
    invoke-static {v12, v15}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_d
    if-ge v1, v5, :cond_1c

    const/4 v1, 0x1

    .line 130
    :cond_1c
    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    int-to-double v14, v14

    move/from16 v18, v6

    int-to-double v5, v1

    div-double/2addr v14, v5

    move-wide/from16 v19, v5

    int-to-double v5, v7

    div-double v5, v5, v19

    int-to-double v12, v13

    move-object v7, v2

    int-to-double v1, v4

    div-double v13, v12, v14

    div-double/2addr v1, v5

    .line 131
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eqz v4, :cond_1e

    const/4 v12, 0x1

    if-ne v4, v12, :cond_1d

    .line 132
    invoke-static {v13, v14, v1, v2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    goto :goto_e

    .line 133
    :cond_1d
    new-instance v0, Landroidx/fragment/app/i0;

    .line 134
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 135
    throw v0

    .line 136
    :cond_1e
    invoke-static {v13, v14, v1, v2}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    .line 137
    :goto_e
    iget-boolean v4, v7, Lj3/n;->f:Z

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    if-eqz v4, :cond_1f

    cmpl-double v4, v1, v5

    if-lez v4, :cond_1f

    move-wide v1, v5

    :cond_1f
    cmpg-double v4, v1, v5

    if-nez v4, :cond_20

    const/4 v4, 0x1

    goto :goto_f

    :cond_20
    const/4 v4, 0x0

    :goto_f
    xor-int/lit8 v7, v4, 0x1

    .line 138
    iput-boolean v7, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    if-nez v4, :cond_10

    const v4, 0x7fffffff

    cmpl-double v7, v1, v5

    if-lez v7, :cond_21

    int-to-double v5, v4

    div-double/2addr v5, v1

    .line 139
    invoke-static {v5, v6}, Lu2/f;->G(D)I

    move-result v1

    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 140
    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    goto/16 :goto_7

    .line 141
    :cond_21
    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    int-to-double v4, v4

    mul-double v4, v4, v1

    .line 142
    invoke-static {v4, v5}, Lu2/f;->G(D)I

    move-result v1

    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    goto/16 :goto_7

    .line 143
    :goto_10
    iput v12, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v1, 0x0

    .line 144
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 145
    :goto_11
    :try_start_5
    new-instance v1, Lj6/g;

    invoke-direct {v1, v8, v12}, Lj6/g;-><init>(Lj6/k;I)V

    const/4 v2, 0x0

    .line 146
    invoke-static {v1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 147
    invoke-virtual {v8}, Lj6/c0;->close()V

    .line 148
    iget-object v2, v3, La3/c;->j:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Exception;

    if-nez v2, :cond_2e

    if-eqz v1, :cond_2d

    .line 149
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v1, v2}, Landroid/graphics/Bitmap;->setDensity(I)V

    if-nez v10, :cond_22

    if-lez v18, :cond_2a

    .line 150
    :cond_22
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 151
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    .line 152
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v4

    if-eqz v10, :cond_23

    const/high16 v4, -0x40800000    # -1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    .line 153
    invoke-virtual {v2, v4, v6, v3, v5}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    :cond_23
    if-lez v18, :cond_24

    move/from16 v4, v18

    int-to-float v6, v4

    .line 154
    invoke-virtual {v2, v6, v3, v5}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    goto :goto_12

    :cond_24
    move/from16 v4, v18

    .line 155
    :goto_12
    new-instance v3, Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    const/4 v7, 0x0

    invoke-direct {v3, v7, v7, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 156
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 157
    iget v5, v3, Landroid/graphics/RectF;->left:F

    cmpg-float v6, v5, v7

    if-nez v6, :cond_25

    iget v6, v3, Landroid/graphics/RectF;->top:F

    cmpg-float v6, v6, v7

    if-nez v6, :cond_25

    :goto_13
    const/16 v3, 0x5a

    goto :goto_14

    :cond_25
    neg-float v5, v5

    .line 158
    iget v3, v3, Landroid/graphics/RectF;->top:F

    neg-float v3, v3

    invoke-virtual {v2, v5, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_13

    :goto_14
    if-eq v4, v3, :cond_28

    const/16 v13, 0x10e

    if-ne v4, v13, :cond_26

    goto :goto_15

    .line 159
    :cond_26
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    .line 160
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v5

    if-nez v5, :cond_27

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 161
    :cond_27
    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    goto :goto_16

    .line 162
    :cond_28
    :goto_15
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    .line 163
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v5

    if-nez v5, :cond_29

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 164
    :cond_29
    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 165
    :goto_16
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 166
    sget-object v5, La3/l;->a:Landroid/graphics/Paint;

    invoke-virtual {v4, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 167
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    move-object v1, v3

    .line 168
    :cond_2a
    new-instance v2, La3/h;

    .line 169
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 170
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v4, v3, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 171
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v12, 0x1

    if-gt v1, v12, :cond_2c

    iget-boolean v0, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    if-eqz v0, :cond_2b

    goto :goto_17

    :cond_2b
    const/4 v12, 0x0

    goto :goto_18

    :cond_2c
    :goto_17
    const/4 v12, 0x1

    .line 172
    :goto_18
    invoke-direct {v2, v4, v12}, La3/h;-><init>(Landroid/graphics/drawable/BitmapDrawable;Z)V

    return-object v2

    .line 173
    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 174
    :cond_2e
    throw v2

    :catchall_3
    move-exception v0

    move-object v1, v0

    .line 175
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v0

    invoke-static {v8, v1}, Lq3/a;->p(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    .line 176
    :cond_2f
    throw v13

    .line 177
    :cond_30
    throw v10

    .line 178
    :pswitch_1d
    check-cast v6, La2/j;

    iget-object v0, v6, La2/j;->i:Ljava/lang/String;

    .line 179
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v2, :cond_31

    if-eqz v0, :cond_31

    iget-boolean v1, v6, La2/j;->k:Z

    if-eqz v1, :cond_31

    .line 180
    new-instance v1, Ljava/io/File;

    iget-object v2, v6, La2/j;->h:Landroid/content/Context;

    .line 181
    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    invoke-virtual {v2}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "getNoBackupFilesDir(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 184
    new-instance v16, La2/i;

    .line 185
    iget-object v0, v6, La2/j;->h:Landroid/content/Context;

    .line 186
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v18

    .line 187
    new-instance v1, La1/q;

    const/4 v2, 0x0

    const/4 v12, 0x1

    invoke-direct {v1, v12, v2}, La1/q;-><init>(IB)V

    .line 188
    iget-object v2, v6, La2/j;->j:Lz1/c;

    .line 189
    iget-boolean v3, v6, La2/j;->l:Z

    move-object/from16 v17, v0

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move/from16 v21, v3

    .line 190
    invoke-direct/range {v16 .. v21}, La2/i;-><init>(Landroid/content/Context;Ljava/lang/String;La1/q;Lz1/c;Z)V

    move-object/from16 v0, v16

    goto :goto_19

    .line 191
    :cond_31
    new-instance v0, La2/i;

    .line 192
    iget-object v1, v6, La2/j;->h:Landroid/content/Context;

    .line 193
    iget-object v2, v6, La2/j;->i:Ljava/lang/String;

    .line 194
    new-instance v3, La1/q;

    const/4 v4, 0x0

    const/4 v12, 0x1

    invoke-direct {v3, v12, v4}, La1/q;-><init>(IB)V

    .line 195
    iget-object v4, v6, La2/j;->j:Lz1/c;

    .line 196
    iget-boolean v5, v6, La2/j;->l:Z

    .line 197
    invoke-direct/range {v0 .. v5}, La2/i;-><init>(Landroid/content/Context;Ljava/lang/String;La1/q;Lz1/c;Z)V

    .line 198
    :goto_19
    iget-boolean v1, v6, La2/j;->n:Z

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_1c
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_1b
    .end packed-switch
.end method
