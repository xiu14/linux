.class public final Ldev/jahir/frames/ui/widgets/CleanSearchView$bindToItem$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/frames/ui/widgets/CleanSearchView;->bindToItem(Landroid/view/MenuItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;


# direct methods
.method public constructor <init>(Ldev/jahir/frames/ui/widgets/CleanSearchView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$bindToItem$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

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
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    const-string v0, "p0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$bindToItem$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldev/jahir/frames/ui/widgets/CleanSearchView;->getOnCollapse()Ld5/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$bindToItem$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {p1, v0}, Ldev/jahir/frames/ui/widgets/CleanSearchView;->access$setOpen$p(Ldev/jahir/frames/ui/widgets/CleanSearchView;Z)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1
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

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    const-string v0, "p0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$bindToItem$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldev/jahir/frames/ui/widgets/CleanSearchView;->getOnExpand()Ld5/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$bindToItem$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-static {p1, v0}, Ldev/jahir/frames/ui/widgets/CleanSearchView;->access$setOpen$p(Ldev/jahir/frames/ui/widgets/CleanSearchView;Z)V

    .line 19
    .line 20
    .line 21
    return v0
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
