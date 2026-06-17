.class public abstract Lcom/afollestad/sectionedrecyclerview/f;
.super Landroidx/recyclerview/widget/i2;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private positionDelegate:Lcom/afollestad/sectionedrecyclerview/e;


# virtual methods
.method public getRelativePosition()Lcom/afollestad/sectionedrecyclerview/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/f;->positionDelegate:Lcom/afollestad/sectionedrecyclerview/e;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/i2;->getAdapterPosition()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    check-cast v0, Lcom/afollestad/sectionedrecyclerview/b;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/afollestad/sectionedrecyclerview/b;->g(I)Lcom/afollestad/sectionedrecyclerview/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
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

.method public isFooter()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/f;->positionDelegate:Lcom/afollestad/sectionedrecyclerview/e;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/i2;->getAdapterPosition()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    check-cast v0, Lcom/afollestad/sectionedrecyclerview/b;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/afollestad/sectionedrecyclerview/b;->b:Lq/f;

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
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

.method public isHeader()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/f;->positionDelegate:Lcom/afollestad/sectionedrecyclerview/e;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/i2;->getAdapterPosition()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    check-cast v0, Lcom/afollestad/sectionedrecyclerview/b;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/afollestad/sectionedrecyclerview/b;->a:Lq/f;

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
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

.method public setPositionDelegate(Lcom/afollestad/sectionedrecyclerview/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/afollestad/sectionedrecyclerview/f;->positionDelegate:Lcom/afollestad/sectionedrecyclerview/e;

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
