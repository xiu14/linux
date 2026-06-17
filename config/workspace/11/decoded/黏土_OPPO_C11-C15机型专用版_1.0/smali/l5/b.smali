.class public final Ll5/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/Iterator;
.implements Le5/a;


# instance fields
.field public h:I

.field public i:I

.field public j:I

.field public k:Li5/c;

.field public final synthetic l:Lk5/n;


# direct methods
.method public constructor <init>(Lk5/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll5/b;->l:Lk5/n;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Ll5/b;->h:I

    .line 8
    .line 9
    iget-object p1, p1, Lk5/n;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {v0, v0, p1}, Lu2/f;->f(III)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Ll5/b;->i:I

    .line 23
    .line 24
    iput p1, p0, Ll5/b;->j:I

    .line 25
    .line 26
    return-void
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
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Ll5/b;->l:Lk5/n;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/n;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/CharSequence;

    .line 6
    .line 7
    iget v2, p0, Ll5/b;->j:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-gez v2, :cond_0

    .line 11
    .line 12
    iput v3, p0, Ll5/b;->h:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Ll5/b;->k:Li5/c;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, -0x1

    .line 23
    const/4 v6, 0x1

    .line 24
    if-le v2, v4, :cond_1

    .line 25
    .line 26
    new-instance v0, Li5/c;

    .line 27
    .line 28
    iget v2, p0, Ll5/b;->i:I

    .line 29
    .line 30
    invoke-static {v1}, Ll5/e;->n0(Ljava/lang/CharSequence;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-direct {v0, v2, v1, v6}, Li5/a;-><init>(III)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Ll5/b;->k:Li5/c;

    .line 38
    .line 39
    iput v5, p0, Ll5/b;->j:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, v0, Lk5/n;->c:Lp4/a;

    .line 43
    .line 44
    check-cast v0, Ld5/p;

    .line 45
    .line 46
    iget v2, p0, Ll5/b;->j:I

    .line 47
    .line 48
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v0, v1, v2}, Ld5/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lp4/f;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    new-instance v0, Li5/c;

    .line 61
    .line 62
    iget v2, p0, Ll5/b;->i:I

    .line 63
    .line 64
    invoke-static {v1}, Ll5/e;->n0(Ljava/lang/CharSequence;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-direct {v0, v2, v1, v6}, Li5/a;-><init>(III)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Ll5/b;->k:Li5/c;

    .line 72
    .line 73
    iput v5, p0, Ll5/b;->j:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object v1, v0, Lp4/f;->h:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iget-object v0, v0, Lp4/f;->i:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget v2, p0, Ll5/b;->i:I

    .line 93
    .line 94
    invoke-static {v2, v1}, Lu2/f;->Q(II)Li5/c;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    iput-object v2, p0, Ll5/b;->k:Li5/c;

    .line 99
    .line 100
    add-int/2addr v1, v0

    .line 101
    iput v1, p0, Ll5/b;->i:I

    .line 102
    .line 103
    if-nez v0, :cond_3

    .line 104
    .line 105
    const/4 v3, 0x1

    .line 106
    :cond_3
    add-int/2addr v1, v3

    .line 107
    iput v1, p0, Ll5/b;->j:I

    .line 108
    .line 109
    :goto_0
    iput v6, p0, Ll5/b;->h:I

    .line 110
    .line 111
    return-void
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

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Ll5/b;->h:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ll5/b;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Ll5/b;->h:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return v0
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

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ll5/b;->h:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ll5/b;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Ll5/b;->h:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Ll5/b;->k:Li5/c;

    .line 14
    .line 15
    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Ll5/b;->k:Li5/c;

    .line 22
    .line 23
    iput v1, p0, Ll5/b;->h:I

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw v0
    .line 32
    .line 33
.end method

.method public final remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
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
