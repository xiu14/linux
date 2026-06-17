.class public final Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder;
.super Lcom/afollestad/sectionedrecyclerview/f;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final descriptionTextView$delegate:Lp4/c;

.field private final titleTextView$delegate:Lp4/c;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/i2;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget v0, Ldev/jahir/frames/R$id;->detail_title:I

    .line 10
    .line 11
    new-instance v1, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder$special$$inlined$findView$default$1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder$special$$inlined$findView$default$1;-><init>(Landroid/view/View;IZ)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder;->titleTextView$delegate:Lp4/c;

    .line 22
    .line 23
    sget v0, Ldev/jahir/frames/R$id;->detail_description:I

    .line 24
    .line 25
    new-instance v1, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder$special$$inlined$findView$default$2;

    .line 26
    .line 27
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder$special$$inlined$findView$default$2;-><init>(Landroid/view/View;IZ)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder;->descriptionTextView$delegate:Lp4/c;

    .line 35
    .line 36
    return-void
    .line 37
.end method

.method private final getDescriptionTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder;->descriptionTextView$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object v0
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

.method private final getTitleTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder;->titleTextView$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object v0
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
.method public final bind(ILjava/lang/String;)V
    .locals 3

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder;->bind(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final bind(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder;->getTitleTextView()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :cond_0
    invoke-direct {p0}, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder;->getDescriptionTextView()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final bind(Lp4/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp4/f;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p1, Lp4/f;->h:Ljava/lang/Object;

    .line 3
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 4
    iget-object p1, p1, Lp4/f;->i:Ljava/lang/Object;

    .line 5
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Ldev/jahir/frames/ui/viewholders/WallpaperDetailViewHolder;->bind(ILjava/lang/String;)V

    return-void
.end method
