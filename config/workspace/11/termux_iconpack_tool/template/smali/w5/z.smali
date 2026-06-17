.class public final Lw5/z;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final h:Landroidx/appcompat/widget/a0;

.field public final i:Lw5/v;

.field public final j:Ljava/lang/String;

.field public final k:I

.field public final l:Lw5/m;

.field public final m:Lw5/n;

.field public final n:Lw5/b0;

.field public final o:Lw5/z;

.field public final p:Lw5/z;

.field public final q:Lw5/z;

.field public final r:J

.field public final s:J

.field public final t:La6/e;

.field public u:Lw5/c;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/a0;Lw5/v;Ljava/lang/String;ILw5/m;Lw5/n;Lw5/b0;Lw5/z;Lw5/z;Lw5/z;JJLa6/e;)V
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "protocol"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "message"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lw5/z;->h:Landroidx/appcompat/widget/a0;

    .line 20
    .line 21
    iput-object p2, p0, Lw5/z;->i:Lw5/v;

    .line 22
    .line 23
    iput-object p3, p0, Lw5/z;->j:Ljava/lang/String;

    .line 24
    .line 25
    iput p4, p0, Lw5/z;->k:I

    .line 26
    .line 27
    iput-object p5, p0, Lw5/z;->l:Lw5/m;

    .line 28
    .line 29
    iput-object p6, p0, Lw5/z;->m:Lw5/n;

    .line 30
    .line 31
    iput-object p7, p0, Lw5/z;->n:Lw5/b0;

    .line 32
    .line 33
    iput-object p8, p0, Lw5/z;->o:Lw5/z;

    .line 34
    .line 35
    iput-object p9, p0, Lw5/z;->p:Lw5/z;

    .line 36
    .line 37
    iput-object p10, p0, Lw5/z;->q:Lw5/z;

    .line 38
    .line 39
    iput-wide p11, p0, Lw5/z;->r:J

    .line 40
    .line 41
    iput-wide p13, p0, Lw5/z;->s:J

    .line 42
    .line 43
    move-object/from16 p1, p15

    .line 44
    .line 45
    iput-object p1, p0, Lw5/z;->t:La6/e;

    .line 46
    .line 47
    return-void
.end method

.method public static a(Ljava/lang/String;Lw5/z;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lw5/z;->m:Lw5/n;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    :cond_0
    return-object p0
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
    .line 38
    .line 39
    .line 40
    .line 41
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
.end method


# virtual methods
.method public final b()Z
    .locals 3

    .line 1
    const/16 v0, 0xc8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lw5/z;->k:I

    .line 5
    .line 6
    if-gt v0, v2, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x12c

    .line 9
    .line 10
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    return v1
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

.method public final c()Lw5/y;
    .locals 3

    .line 1
    new-instance v0, Lw5/y;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lw5/z;->h:Landroidx/appcompat/widget/a0;

    .line 7
    .line 8
    iput-object v1, v0, Lw5/y;->a:Landroidx/appcompat/widget/a0;

    .line 9
    .line 10
    iget-object v1, p0, Lw5/z;->i:Lw5/v;

    .line 11
    .line 12
    iput-object v1, v0, Lw5/y;->b:Lw5/v;

    .line 13
    .line 14
    iget v1, p0, Lw5/z;->k:I

    .line 15
    .line 16
    iput v1, v0, Lw5/y;->c:I

    .line 17
    .line 18
    iget-object v1, p0, Lw5/z;->j:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v1, v0, Lw5/y;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p0, Lw5/z;->l:Lw5/m;

    .line 23
    .line 24
    iput-object v1, v0, Lw5/y;->e:Lw5/m;

    .line 25
    .line 26
    iget-object v1, p0, Lw5/z;->m:Lw5/n;

    .line 27
    .line 28
    invoke-virtual {v1}, Lw5/n;->h()Lp3/j;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v0, Lw5/y;->f:Lp3/j;

    .line 33
    .line 34
    iget-object v1, p0, Lw5/z;->n:Lw5/b0;

    .line 35
    .line 36
    iput-object v1, v0, Lw5/y;->g:Lw5/b0;

    .line 37
    .line 38
    iget-object v1, p0, Lw5/z;->o:Lw5/z;

    .line 39
    .line 40
    iput-object v1, v0, Lw5/y;->h:Lw5/z;

    .line 41
    .line 42
    iget-object v1, p0, Lw5/z;->p:Lw5/z;

    .line 43
    .line 44
    iput-object v1, v0, Lw5/y;->i:Lw5/z;

    .line 45
    .line 46
    iget-object v1, p0, Lw5/z;->q:Lw5/z;

    .line 47
    .line 48
    iput-object v1, v0, Lw5/y;->j:Lw5/z;

    .line 49
    .line 50
    iget-wide v1, p0, Lw5/z;->r:J

    .line 51
    .line 52
    iput-wide v1, v0, Lw5/y;->k:J

    .line 53
    .line 54
    iget-wide v1, p0, Lw5/z;->s:J

    .line 55
    .line 56
    iput-wide v1, v0, Lw5/y;->l:J

    .line 57
    .line 58
    iget-object v1, p0, Lw5/z;->t:La6/e;

    .line 59
    .line 60
    iput-object v1, v0, Lw5/y;->m:La6/e;

    .line 61
    .line 62
    return-object v0
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

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw5/z;->n:Lw5/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lw5/b0;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "response is not eligible for a body and must not be closed"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Response{protocol="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lw5/z;->i:Lw5/v;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", code="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lw5/z;->k:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", message="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lw5/z;->j:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", url="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lw5/z;->h:Landroidx/appcompat/widget/a0;

    .line 39
    .line 40
    iget-object v1, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lw5/p;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const/16 v1, 0x7d

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
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
