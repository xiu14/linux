.class public abstract Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;
.super Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ldev/jahir/frames/data/Preferences;",
        ">",
        "Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity<",
        "TP;>;"
    }
.end annotation


# static fields
.field private static final APPLY_WITH_OTHER_APP_CODE:I = 0x23f

.field public static final Companion:Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity$Companion;


# instance fields
.field private externalApplyLauncher:Ld/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/c;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->Companion:Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity$Companion;

    .line 8
    .line 9
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method private static final onCreate$lambda$0(Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;Ld/a;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p1, p1, Ld/a;->h:I

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->onWallpaperApplied()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->onDownloadError$library_release()V

    .line 15
    .line 16
    .line 17
    return-void
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

.method private final onWallpaperApplicationEnqueued(I)V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    :try_start_0
    sget p1, Ldev/jahir/frames/R$string;->applying_preparing:I

    .line 5
    .line 6
    :goto_0
    move v1, p1

    .line 7
    goto :goto_1

    .line 8
    :catch_0
    move-object v0, p0

    .line 9
    goto :goto_2

    .line 10
    :cond_0
    sget p1, Ldev/jahir/frames/R$string;->applying_wallpaper_def:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :goto_1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->getSnackbarAnchorId()I

    .line 14
    .line 15
    .line 16
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    const/16 v5, 0x8

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v2, -0x2

    .line 21
    const/4 v4, 0x0

    .line 22
    move-object v0, p0

    .line 23
    :try_start_1
    invoke-static/range {v0 .. v6}, Ldev/jahir/frames/extensions/views/SnackbarKt;->snackbar$default(Landroid/app/Activity;IIILd5/l;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->setCurrentSnackbar(Lcom/google/android/material/snackbar/Snackbar;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 28
    .line 29
    .line 30
    :catch_1
    :goto_2
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private final onWallpaperApplied()V
    .locals 7

    .line 1
    :try_start_0
    sget v1, Ldev/jahir/frames/R$string;->applying_applied:I

    .line 2
    .line 3
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->getSnackbarAnchorId()I

    .line 4
    .line 5
    .line 6
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const/16 v5, 0xa

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move-object v0, p0

    .line 13
    :try_start_1
    invoke-static/range {v0 .. v6}, Ldev/jahir/frames/extensions/views/SnackbarKt;->snackbar$default(Landroid/app/Activity;IIILd5/l;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->setCurrentSnackbar(Lcom/google/android/material/snackbar/Snackbar;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-object v0, p0

    .line 22
    :catch_1
    :goto_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->cancelWorkManagerTasks()V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic s(Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;ILl2/c0;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->startApply$lambda$2$lambda$1(Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;ILl2/c0;)Lp4/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method private static final startApply$lambda$2$lambda$1(Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;ILl2/c0;)Lp4/k;
    .locals 3

    .line 1
    if-eqz p2, :cond_5

    .line 2
    .line 3
    iget-object v0, p2, Ll2/c0;->c:Ll2/h;

    .line 4
    .line 5
    iget p2, p2, Ll2/c0;->l:I

    .line 6
    .line 7
    invoke-static {p2}, Landroidx/appcompat/app/b;->e(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    const/4 p1, 0x3

    .line 14
    if-ne p2, p1, :cond_3

    .line 15
    .line 16
    const/4 p2, -0x1

    .line 17
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object v1, v0, Ll2/h;->a:Ljava/util/HashMap;

    .line 22
    .line 23
    const-string v2, "apply_option_key"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    instance-of v2, v1, Ljava/lang/Integer;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    move-object p2, v1

    .line 34
    :cond_0
    check-cast p2, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-ne p2, p1, :cond_2

    .line 41
    .line 42
    const-string p1, "download_path"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ll2/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-nez p1, :cond_1

    .line 49
    .line 50
    const-string p1, ""

    .line 51
    .line 52
    :cond_1
    invoke-virtual {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->onWallpaperReadyToBeApplied(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-direct {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->onWallpaperApplied()V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 p1, 0x4

    .line 61
    if-ne p2, p1, :cond_5

    .line 62
    .line 63
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->onDownloadError$library_release()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    const/4 v0, 0x1

    .line 68
    if-ne p2, v0, :cond_5

    .line 69
    .line 70
    invoke-direct {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->onWallpaperApplicationEnqueued(I)V

    .line 71
    .line 72
    .line 73
    :cond_5
    :goto_0
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 74
    .line 75
    return-object p0
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static synthetic t(Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;Ld/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->onCreate$lambda$0(Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;Ld/a;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Ldev/jahir/frames/ui/activities/base/BaseFavoritesConnectedActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/fragment/app/e1;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p1, v0}, Landroidx/fragment/app/e1;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ldev/jahir/blueprint/ui/fragments/a;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1, p0}, Ldev/jahir/blueprint/ui/fragments/a;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Lb/q;->registerForActivityResult(Le/a;Ld/b;)Ld/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->externalApplyLauncher:Ld/c;

    .line 21
    .line 22
    return-void
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
.end method

.method public onWallpaperReadyToBeApplied(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 2
    .line 3
    const-string v1, "path"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->getCurrentSnackbar()Lcom/google/android/material/snackbar/Snackbar;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    invoke-virtual {v1, v2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, p0}, Ldev/jahir/frames/extensions/resources/FileKt;->getUri(Ljava/io/File;Landroid/content/Context;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_1
    if-eqz p1, :cond_3

    .line 34
    .line 35
    new-instance v1, Landroid/content/Intent;

    .line 36
    .line 37
    const-string v2, "android.intent.action.ATTACH_DATA"

    .line 38
    .line 39
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "image/*"

    .line 43
    .line 44
    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    const-string p1, "mimeType"

    .line 48
    .line 49
    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    sget p1, Ldev/jahir/frames/R$string;->apply_w_external_app:I

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-static {p0, p1, v3, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {v1, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :try_start_0
    iget-object v1, p0, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;->externalApplyLauncher:Ld/c;

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1, v3}, Ld/c;->a(Ljava/lang/Object;Lb0/j;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    move-object v0, v3

    .line 80
    goto :goto_0

    .line 81
    :catch_0
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->onDownloadError$library_release()V

    .line 82
    .line 83
    .line 84
    :goto_0
    if-nez v0, :cond_4

    .line 85
    .line 86
    :cond_3
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->onDownloadError$library_release()V

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->cancelWorkManagerTasks()V

    .line 90
    .line 91
    .line 92
    return-void
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final startApply(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->cancelWorkManagerTasks()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldev/jahir/frames/data/workers/WallpaperApplier;->Companion:Ldev/jahir/frames/data/workers/WallpaperApplier$Companion;

    .line 5
    .line 6
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->getWallpaperDownloadUrl$library_release()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1, p1}, Ldev/jahir/frames/data/workers/WallpaperApplier$Companion;->buildRequest(Ljava/lang/String;I)Ll2/u;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->getWorkManager$library_release()Ll2/d0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1, v0}, Ll2/d0;->a(Ll2/u;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperFetcherActivity;->getWorkManager$library_release()Ll2/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v0, v0, Ll2/u;->a:Ljava/util/UUID;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ll2/d0;->b(Ljava/util/UUID;)Landroidx/lifecycle/h0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ldev/jahir/frames/ui/activities/base/j;

    .line 34
    .line 35
    invoke-direct {v1, p0, p1}, Ldev/jahir/frames/ui/activities/base/j;-><init>(Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity;I)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity$sam$androidx_lifecycle_Observer$0;

    .line 39
    .line 40
    invoke-direct {p1, v1}, Ldev/jahir/frames/ui/activities/base/BaseWallpaperApplierActivity$sam$androidx_lifecycle_Observer$0;-><init>(Ld5/l;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0, p1}, Landroidx/lifecycle/f0;->e(Landroidx/lifecycle/w;Landroidx/lifecycle/j0;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
