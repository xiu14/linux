.class public final Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity$permissionRequestListener$2$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity<",
            "TP;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity<",
            "+TP;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity$permissionRequestListener$2$1;->this$0:Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method


# virtual methods
.method public onPermissionsDenied(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lj4/a;->a(Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivityKt;->getPermissionsResult(Ljava/util/List;)Ldev/jahir/frames/ui/activities/base/PermissionsResult;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ldev/jahir/frames/ui/activities/base/PermissionsResult;->getNotifications()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v1, p0, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity$permissionRequestListener$2$1;->this$0:Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 21
    .line 22
    invoke-virtual {p1}, Ldev/jahir/frames/ui/activities/base/PermissionsResult;->getStorage()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    sget p1, Ldev/jahir/frames/R$string;->permission_denied:I

    .line 29
    .line 30
    :goto_0
    move v2, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget p1, Ldev/jahir/frames/R$string;->notifications_permission_denied:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object p1, p0, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity$permissionRequestListener$2$1;->this$0:Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 36
    .line 37
    invoke-virtual {p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->getSnackbarAnchorId()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/16 v6, 0x8

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-static/range {v1 .. v7}, Ldev/jahir/frames/extensions/views/SnackbarKt;->snackbar$default(Landroid/app/Activity;IIILd5/l;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v1, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->setCurrentSnackbar(Lcom/google/android/material/snackbar/Snackbar;)V

    .line 51
    .line 52
    .line 53
    return-void
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

.method public onPermissionsGranted(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lj4/a;->b(Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lq4/i;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lt3/f;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity$permissionRequestListener$2$1;->this$0:Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 18
    .line 19
    invoke-virtual {p1}, Lt3/f;->a()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->internalOnPermissionsGranted(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
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

.method public onPermissionsPermanentlyDenied(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lj4/a;->c(Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivityKt;->getPermissionsResult(Ljava/util/List;)Ldev/jahir/frames/ui/activities/base/PermissionsResult;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity$permissionRequestListener$2$1;->this$0:Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 14
    .line 15
    invoke-virtual {p1}, Ldev/jahir/frames/ui/activities/base/PermissionsResult;->getStorage()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    sget p1, Ldev/jahir/frames/R$string;->permission_permanently_denied:I

    .line 22
    .line 23
    :goto_0
    move v1, p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    sget p1, Ldev/jahir/frames/R$string;->notifications_permission_permanently_denied:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    iget-object p1, p0, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity$permissionRequestListener$2$1;->this$0:Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 29
    .line 30
    invoke-virtual {p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->getSnackbarAnchorId()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/16 v5, 0x8

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v0 .. v6}, Ldev/jahir/frames/extensions/views/SnackbarKt;->snackbar$default(Landroid/app/Activity;IIILd5/l;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->setCurrentSnackbar(Lcom/google/android/material/snackbar/Snackbar;)V

    .line 44
    .line 45
    .line 46
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

.method public onPermissionsResult(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lj4/a;->d(Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;Ljava/util/List;)V

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
.end method

.method public onPermissionsShouldShowRationale(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lj4/a;->e(Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity$permissionRequestListener$2$1;->this$0:Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;

    .line 10
    .line 11
    invoke-static {v0, p1}, Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;->access$showPermissionRationale(Ldev/jahir/frames/ui/activities/base/BasePermissionsRequestActivity;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method
