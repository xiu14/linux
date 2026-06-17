.class public final Ldev/jahir/frames/ui/widgets/CleanSearchView$init$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroidx/appcompat/widget/m3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/frames/ui/widgets/CleanSearchView;->init()V
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
    iput-object p1, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$init$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

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
.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$init$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldev/jahir/frames/ui/widgets/CleanSearchView;->getOnQueryChanged()Ld5/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1}, Ll5/e;->I0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 p1, 0x1

    .line 21
    return p1
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

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$init$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldev/jahir/frames/ui/widgets/CleanSearchView;->getOnQuerySubmit()Ld5/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1}, Ll5/e;->I0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$init$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

    .line 21
    .line 22
    invoke-virtual {p1}, Ldev/jahir/frames/ui/widgets/CleanSearchView;->getAllowKeyboardHideOnSubmit()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Ldev/jahir/frames/ui/widgets/CleanSearchView$init$1;->this$0:Ldev/jahir/frames/ui/widgets/CleanSearchView;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/appcompat/widget/s3;->clearFocus()V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    return p1
    .line 35
    .line 36
    .line 37
.end method
