.class public final Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;
.super Landroidx/recyclerview/widget/i2;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final answerView$delegate:Lp4/c;

.field private final questionView$delegate:Lp4/c;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "itemView"

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
    sget v0, Ldev/jahir/blueprint/R$id;->help_question:I

    .line 10
    .line 11
    new-instance v1, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder$special$$inlined$findView$default$1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder$special$$inlined$findView$default$1;-><init>(Landroid/view/View;IZ)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;->questionView$delegate:Lp4/c;

    .line 22
    .line 23
    sget v0, Ldev/jahir/blueprint/R$id;->help_answer:I

    .line 24
    .line 25
    new-instance v1, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder$special$$inlined$findView$default$2;

    .line 26
    .line 27
    invoke-direct {v1, p1, v0, v2}, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder$special$$inlined$findView$default$2;-><init>(Landroid/view/View;IZ)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;->answerView$delegate:Lp4/c;

    .line 35
    .line 36
    return-void
    .line 37
.end method

.method private final getAnswerView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;->answerView$delegate:Lp4/c;

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

.method private final getQuestionView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;->questionView$delegate:Lp4/c;

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
.method public final bind(Lp4/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp4/f;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "helpItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;->getQuestionView()Landroid/widget/TextView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p1, Lp4/f;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/CharSequence;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-direct {p0}, Ldev/jahir/blueprint/ui/viewholders/HelpViewHolder;->getAnswerView()Landroid/widget/TextView;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object p1, p1, Lp4/f;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Ljava/lang/CharSequence;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
