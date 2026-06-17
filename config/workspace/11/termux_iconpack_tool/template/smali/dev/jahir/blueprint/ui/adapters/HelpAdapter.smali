.class public final Ldev/jahir/blueprint/ui/adapters/HelpAdapter;
.super Landroidx/recyclerview/widget/s0;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/s0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;->INSTANCE:Ldev/jahir/blueprint/ui/adapters/HelpAdapter$DiffCallback;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/s0;-><init>(Landroidx/recyclerview/widget/v;)V

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
.end method


# virtual methods
.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/i2;I)V
    .locals 0

    .line 1
    check-cast p1, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/HelpAdapter;->onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/s0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp4/f;

    invoke-virtual {p1, p2}, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;->bind(Lp4/f;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/i2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/HelpAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;
    .locals 4

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;

    sget v0, Ldev/jahir/blueprint/R$layout;->item_help:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method
