.class public final Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;
.super Lcom/afollestad/sectionedrecyclerview/f;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final divider$delegate:Lp4/c;

.field private final subtitleTextView$delegate:Lp4/c;

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
    sget v0, Ldev/jahir/frames/R$id;->section_title:I

    .line 10
    .line 11
    new-instance v1, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder$special$$inlined$findView$default$1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder$special$$inlined$findView$default$1;-><init>(Landroid/view/View;IZ)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->titleTextView$delegate:Lp4/c;

    .line 22
    .line 23
    sget v0, Ldev/jahir/frames/R$id;->section_subtitle:I

    .line 24
    .line 25
    new-instance v1, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder$special$$inlined$findView$default$2;

    .line 26
    .line 27
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder$special$$inlined$findView$default$2;-><init>(Landroid/view/View;IZ)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->subtitleTextView$delegate:Lp4/c;

    .line 35
    .line 36
    sget v0, Ldev/jahir/frames/R$id;->divider_layout:I

    .line 37
    .line 38
    new-instance v1, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder$special$$inlined$findView$default$3;

    .line 39
    .line 40
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder$special$$inlined$findView$default$3;-><init>(Landroid/view/View;IZ)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->divider$delegate:Lp4/c;

    .line 48
    .line 49
    return-void
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

.method public static synthetic bind$default(Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;IIZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 1
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(IIZ)V

    return-void
.end method

.method public static synthetic bind$default(Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;ILd5/l;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 5
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(ILd5/l;Z)V

    return-void
.end method

.method public static synthetic bind$default(Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;ILjava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(ILjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic bind$default(Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;Ljava/lang/String;IZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 3
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(Ljava/lang/String;IZ)V

    return-void
.end method

.method public static synthetic bind$default(Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;Ljava/lang/String;Ld5/l;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(Ljava/lang/String;Ld5/l;Z)V

    return-void
.end method

.method public static synthetic bind$default(Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 4
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method private final getDivider()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->divider$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

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

.method private final getSubtitleTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->subtitleTextView$delegate:Lp4/c;

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
    iget-object v0, p0, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->titleTextView$delegate:Lp4/c;

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
.method public final bind(IIZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, p1, v2, v3, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p2, v2, v3, v2}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public final bind(ILd5/l;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ld5/l;",
            "Z)V"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(Ljava/lang/String;Ld5/l;Z)V

    return-void
.end method

.method public final bind(ILjava/lang/String;Z)V
    .locals 3

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public final bind(Ljava/lang/String;IZ)V
    .locals 3

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p2, v1, v2, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->string$default(Landroid/content/Context;I[Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public final bind(Ljava/lang/String;Ld5/l;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ld5/l;",
            "Z)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 14
    invoke-static {p0}, Ldev/jahir/frames/extensions/views/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/i2;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {p2, v1}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const-string v2, ""

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    if-eqz p2, :cond_2

    .line 15
    invoke-static {p0}, Ldev/jahir/frames/extensions/views/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/i2;)Landroid/content/Context;

    move-result-object v0

    invoke-interface {p2, v0}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    :cond_2
    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v0

    :goto_1
    invoke-virtual {p0, p1, v2, p3}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->bind(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 16
    invoke-static {v1}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 17
    invoke-direct {p0}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->getSubtitleTextView()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    :cond_4
    return-void
.end method

.method public final bind(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->getTitleTextView()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    :cond_0
    invoke-direct {p0}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->getTitleTextView()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    move-result p1

    invoke-static {v0, p1}, Ldev/jahir/frames/extensions/views/ViewKt;->visibleIf(Landroid/view/View;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 6
    :cond_1
    invoke-direct {p0}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->getSubtitleTextView()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    const/16 v0, 0x3f

    .line 8
    invoke-static {p2, v0}, Lk0/c;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v0

    goto :goto_0

    .line 9
    :cond_2
    invoke-static {p2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    .line 10
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    :cond_3
    invoke-direct {p0}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->getSubtitleTextView()Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p2}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    move-result p2

    invoke-static {p1, p2}, Ldev/jahir/frames/extensions/views/ViewKt;->visibleIf(Landroid/view/View;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 12
    :cond_4
    invoke-direct {p0}, Ldev/jahir/frames/ui/viewholders/SectionHeaderViewHolder;->getDivider()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1, p3}, Ldev/jahir/frames/extensions/views/ViewKt;->visibleIf(Landroid/view/View;Z)Landroid/view/View;

    :cond_5
    return-void
.end method
