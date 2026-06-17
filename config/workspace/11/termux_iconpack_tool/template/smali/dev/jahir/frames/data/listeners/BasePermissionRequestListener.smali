.class public interface abstract Ldev/jahir/frames/data/listeners/BasePermissionRequestListener;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lw3/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/data/listeners/BasePermissionRequestListener$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract onPermissionsDenied(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onPermissionsGranted(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onPermissionsPermanentlyDenied(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onPermissionsResult(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onPermissionsShouldShowRationale(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lt3/f;",
            ">;)V"
        }
    .end annotation
.end method
