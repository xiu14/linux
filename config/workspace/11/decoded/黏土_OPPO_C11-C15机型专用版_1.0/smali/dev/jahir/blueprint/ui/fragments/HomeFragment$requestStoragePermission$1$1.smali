.class public final Ldev/jahir/blueprint/ui/fragments/HomeFragment$requestStoragePermission$1$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/blueprint/ui/fragments/HomeFragment;->requestStoragePermission()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ldev/jahir/blueprint/ui/fragments/HomeFragment;


# direct methods
.method public constructor <init>(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment$requestStoragePermission$1$1;->this$0:Ldev/jahir/blueprint/ui/fragments/HomeFragment;

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
    invoke-static {p0, p1}, Lj4/a;->a(Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;Ljava/util/List;)V

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
    iget-object p1, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment$requestStoragePermission$1$1;->this$0:Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 10
    .line 11
    invoke-static {p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->access$getAdapter(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment$requestStoragePermission$1$1;->this$0:Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 16
    .line 17
    invoke-static {v0}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->access$getWallpaper(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->setWallpaper(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public onPermissionsPermanentlyDenied(Ljava/util/List;)V
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
    invoke-static {p0, p1}, Lj4/a;->c(Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;Ljava/util/List;)V

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
    iget-object p1, p0, Ldev/jahir/blueprint/ui/fragments/HomeFragment$requestStoragePermission$1$1;->this$0:Ldev/jahir/blueprint/ui/fragments/HomeFragment;

    .line 10
    .line 11
    invoke-static {p1}, Ldev/jahir/blueprint/ui/fragments/HomeFragment;->access$showPermissionRationale(Ldev/jahir/blueprint/ui/fragments/HomeFragment;)V

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
