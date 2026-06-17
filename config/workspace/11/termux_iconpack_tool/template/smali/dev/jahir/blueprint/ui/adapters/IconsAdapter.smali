.class public final Ldev/jahir/blueprint/ui/adapters/IconsAdapter;
.super Landroidx/recyclerview/widget/c1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/c1;"
    }
.end annotation


# instance fields
.field private animate:Z

.field private icons:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/Icon;",
            ">;"
        }
    .end annotation
.end field

.field private onClick:Ld5/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/p;"
        }
    .end annotation
.end field

.field private final showIconName:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;-><init>(ZLd5/p;ZILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(ZLd5/p;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ld5/p;",
            "Z)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/c1;-><init>()V

    .line 4
    iput-boolean p1, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->animate:Z

    .line 5
    iput-object p2, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->onClick:Ld5/p;

    .line 6
    iput-boolean p3, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->showIconName:Z

    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/c1;->setHasStableIds(Z)V

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->icons:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(ZLd5/p;ZILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 2
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;-><init>(ZLd5/p;Z)V

    return-void
.end method


# virtual methods
.method public final getAnimate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->animate:Z

    .line 2
    .line 3
    return v0
    .line 4
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

.method public final getIcons()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/Icon;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->icons:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->icons:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getItemId(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->icons:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ldev/jahir/blueprint/data/models/Icon;

    .line 8
    .line 9
    invoke-virtual {p1}, Ldev/jahir/blueprint/data/models/Icon;->getResId()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    int-to-long v0, p1

    .line 14
    return-wide v0
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

.method public final getOnClick()Ld5/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld5/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->onClick:Ld5/p;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public final getShowIconName()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->showIconName:Z

    .line 2
    .line 3
    return v0
    .line 4
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

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/i2;I)V
    .locals 0

    .line 1
    check-cast p1, Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->icons:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "get(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ldev/jahir/blueprint/data/models/Icon;

    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->animate:Z

    iget-object v1, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->onClick:Ld5/p;

    invoke-virtual {p1, p2, v0, v1}, Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;->bind(Ldev/jahir/blueprint/data/models/Icon;ZLd5/p;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/i2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;
    .locals 4

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;

    .line 3
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->showIconName:Z

    if-eqz v0, :cond_0

    sget v0, Ldev/jahir/blueprint/R$layout;->item_icon_with_name:I

    goto :goto_0

    .line 4
    :cond_0
    sget v0, Ldev/jahir/blueprint/R$layout;->item_icon:I

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 5
    invoke-static {p1, v0, v3, v1, v2}, Ldev/jahir/frames/extensions/views/ViewKt;->inflate$default(Landroid/view/ViewGroup;IZILjava/lang/Object;)Landroid/view/View;

    move-result-object p1

    .line 6
    invoke-direct {p2, p1}, Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public bridge synthetic onViewRecycled(Landroidx/recyclerview/widget/i2;)V
    .locals 0

    .line 1
    check-cast p1, Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;

    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->onViewRecycled(Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;)V

    return-void
.end method

.method public onViewRecycled(Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/c1;->onViewRecycled(Landroidx/recyclerview/widget/i2;)V

    .line 3
    iget-boolean v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->animate:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ldev/jahir/blueprint/ui/viewholders/IconViewHolder;->unbind()V

    :cond_0
    return-void
.end method

.method public final setAnimate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->animate:Z

    .line 2
    .line 3
    return-void
    .line 4
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

.method public final setIcons(Ljava/util/ArrayList;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/Icon;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->icons:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->icons:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 17
    .line 18
    .line 19
    return-void
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

.method public final setOnClick(Ld5/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/p;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldev/jahir/blueprint/ui/adapters/IconsAdapter;->onClick:Ld5/p;

    .line 2
    .line 3
    return-void
    .line 4
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
