.class public final Lh2/l;
.super Lh2/m;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Ljava/util/ArrayList;

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public final j:Landroid/graphics/Matrix;

.field public k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lh2/l;->a:Landroid/graphics/Matrix;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lh2/l;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lh2/l;->c:F

    .line 5
    iput v0, p0, Lh2/l;->d:F

    .line 6
    iput v0, p0, Lh2/l;->e:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    iput v1, p0, Lh2/l;->f:F

    .line 8
    iput v1, p0, Lh2/l;->g:F

    .line 9
    iput v0, p0, Lh2/l;->h:F

    .line 10
    iput v0, p0, Lh2/l;->i:F

    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lh2/l;->j:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lh2/l;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lh2/l;Lq/f;)V
    .locals 6

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lh2/l;->a:Landroid/graphics/Matrix;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lh2/l;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lh2/l;->c:F

    .line 17
    iput v0, p0, Lh2/l;->d:F

    .line 18
    iput v0, p0, Lh2/l;->e:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    iput v1, p0, Lh2/l;->f:F

    .line 20
    iput v1, p0, Lh2/l;->g:F

    .line 21
    iput v0, p0, Lh2/l;->h:F

    .line 22
    iput v0, p0, Lh2/l;->i:F

    .line 23
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lh2/l;->j:Landroid/graphics/Matrix;

    const/4 v3, 0x0

    .line 24
    iput-object v3, p0, Lh2/l;->k:Ljava/lang/String;

    .line 25
    iget v3, p1, Lh2/l;->c:F

    iput v3, p0, Lh2/l;->c:F

    .line 26
    iget v3, p1, Lh2/l;->d:F

    iput v3, p0, Lh2/l;->d:F

    .line 27
    iget v3, p1, Lh2/l;->e:F

    iput v3, p0, Lh2/l;->e:F

    .line 28
    iget v3, p1, Lh2/l;->f:F

    iput v3, p0, Lh2/l;->f:F

    .line 29
    iget v3, p1, Lh2/l;->g:F

    iput v3, p0, Lh2/l;->g:F

    .line 30
    iget v3, p1, Lh2/l;->h:F

    iput v3, p0, Lh2/l;->h:F

    .line 31
    iget v3, p1, Lh2/l;->i:F

    iput v3, p0, Lh2/l;->i:F

    .line 32
    iget-object v3, p1, Lh2/l;->k:Ljava/lang/String;

    iput-object v3, p0, Lh2/l;->k:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 33
    invoke-virtual {p2, v3, p0}, Lq/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    :cond_0
    iget-object v3, p1, Lh2/l;->j:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 35
    iget-object p1, p1, Lh2/l;->b:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 36
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 37
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 38
    instance-of v4, v3, Lh2/l;

    if-eqz v4, :cond_1

    .line 39
    check-cast v3, Lh2/l;

    .line 40
    iget-object v4, p0, Lh2/l;->b:Ljava/util/ArrayList;

    new-instance v5, Lh2/l;

    invoke-direct {v5, v3, p2}, Lh2/l;-><init>(Lh2/l;Lq/f;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 41
    :cond_1
    instance-of v4, v3, Lh2/k;

    if-eqz v4, :cond_2

    .line 42
    new-instance v4, Lh2/k;

    check-cast v3, Lh2/k;

    .line 43
    invoke-direct {v4, v3}, Lh2/n;-><init>(Lh2/n;)V

    .line 44
    iput v0, v4, Lh2/k;->e:F

    .line 45
    iput v1, v4, Lh2/k;->g:F

    .line 46
    iput v1, v4, Lh2/k;->h:F

    .line 47
    iput v0, v4, Lh2/k;->i:F

    .line 48
    iput v1, v4, Lh2/k;->j:F

    .line 49
    iput v0, v4, Lh2/k;->k:F

    .line 50
    sget-object v5, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v5, v4, Lh2/k;->l:Landroid/graphics/Paint$Cap;

    .line 51
    sget-object v5, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v5, v4, Lh2/k;->m:Landroid/graphics/Paint$Join;

    const/high16 v5, 0x40800000    # 4.0f

    .line 52
    iput v5, v4, Lh2/k;->n:F

    .line 53
    iget-object v5, v3, Lh2/k;->d:Lb6/i;

    iput-object v5, v4, Lh2/k;->d:Lb6/i;

    .line 54
    iget v5, v3, Lh2/k;->e:F

    iput v5, v4, Lh2/k;->e:F

    .line 55
    iget v5, v3, Lh2/k;->g:F

    iput v5, v4, Lh2/k;->g:F

    .line 56
    iget-object v5, v3, Lh2/k;->f:Lb6/i;

    iput-object v5, v4, Lh2/k;->f:Lb6/i;

    .line 57
    iget v5, v3, Lh2/n;->c:I

    iput v5, v4, Lh2/n;->c:I

    .line 58
    iget v5, v3, Lh2/k;->h:F

    iput v5, v4, Lh2/k;->h:F

    .line 59
    iget v5, v3, Lh2/k;->i:F

    iput v5, v4, Lh2/k;->i:F

    .line 60
    iget v5, v3, Lh2/k;->j:F

    iput v5, v4, Lh2/k;->j:F

    .line 61
    iget v5, v3, Lh2/k;->k:F

    iput v5, v4, Lh2/k;->k:F

    .line 62
    iget-object v5, v3, Lh2/k;->l:Landroid/graphics/Paint$Cap;

    iput-object v5, v4, Lh2/k;->l:Landroid/graphics/Paint$Cap;

    .line 63
    iget-object v5, v3, Lh2/k;->m:Landroid/graphics/Paint$Join;

    iput-object v5, v4, Lh2/k;->m:Landroid/graphics/Paint$Join;

    .line 64
    iget v3, v3, Lh2/k;->n:F

    iput v3, v4, Lh2/k;->n:F

    goto :goto_1

    .line 65
    :cond_2
    instance-of v4, v3, Lh2/j;

    if-eqz v4, :cond_4

    .line 66
    new-instance v4, Lh2/j;

    check-cast v3, Lh2/j;

    .line 67
    invoke-direct {v4, v3}, Lh2/n;-><init>(Lh2/n;)V

    .line 68
    :goto_1
    iget-object v3, p0, Lh2/l;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    iget-object v3, v4, Lh2/n;->b:Ljava/lang/String;

    if-eqz v3, :cond_3

    .line 70
    invoke-virtual {p2, v3, v4}, Lq/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 71
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown object in the tree!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lh2/l;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v1, v3, :cond_1

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lh2/m;

    .line 16
    .line 17
    invoke-virtual {v2}, Lh2/m;->a()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final b([I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lh2/l;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v0, v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lh2/m;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Lh2/m;->b([I)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    or-int/2addr v1, v2

    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return v1
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

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lh2/l;->j:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lh2/l;->d:F

    .line 7
    .line 8
    neg-float v1, v1

    .line 9
    iget v2, p0, Lh2/l;->e:F

    .line 10
    .line 11
    neg-float v2, v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lh2/l;->f:F

    .line 16
    .line 17
    iget v2, p0, Lh2/l;->g:F

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lh2/l;->c:F

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v1, v2, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lh2/l;->h:F

    .line 29
    .line 30
    iget v2, p0, Lh2/l;->d:F

    .line 31
    .line 32
    add-float/2addr v1, v2

    .line 33
    iget v2, p0, Lh2/l;->i:F

    .line 34
    .line 35
    iget v3, p0, Lh2/l;->e:F

    .line 36
    .line 37
    add-float/2addr v2, v3

    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/l;->k:Ljava/lang/String;

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

.method public getLocalMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/l;->j:Landroid/graphics/Matrix;

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

.method public getPivotX()F
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->d:F

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

.method public getPivotY()F
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->e:F

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

.method public getRotation()F
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->c:F

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

.method public getScaleX()F
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->f:F

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

.method public getScaleY()F
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->g:F

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

.method public getTranslateX()F
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->h:F

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

.method public getTranslateY()F
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->i:F

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

.method public setPivotX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->d:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lh2/l;->d:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lh2/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public setPivotY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->e:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lh2/l;->e:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lh2/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public setRotation(F)V
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->c:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lh2/l;->c:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lh2/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public setScaleX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->f:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lh2/l;->f:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lh2/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public setScaleY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->g:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lh2/l;->g:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lh2/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public setTranslateX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->h:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lh2/l;->h:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lh2/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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

.method public setTranslateY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lh2/l;->i:F

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lh2/l;->i:F

    .line 8
    .line 9
    invoke-virtual {p0}, Lh2/l;->c()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
