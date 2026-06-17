.class public Lcom/github/javiersantos/licensing/ResponseData;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:J

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static a(Ljava/lang/String;)Lcom/github/javiersantos/licensing/ResponseData;
    .locals 6

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    const-string v4, ""

    .line 11
    .line 12
    if-ne v1, v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-lt v0, v5, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    add-int/2addr v0, v2

    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    :goto_0
    move-object p0, v1

    .line 32
    :goto_1
    const-string v0, "|"

    .line 33
    .line 34
    invoke-static {v0}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p0, v0}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    array-length v0, p0

    .line 43
    const/4 v1, 0x6

    .line 44
    if-lt v0, v1, :cond_2

    .line 45
    .line 46
    new-instance v0, Lcom/github/javiersantos/licensing/ResponseData;

    .line 47
    .line 48
    invoke-direct {v0}, Lcom/github/javiersantos/licensing/ResponseData;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v4, v0, Lcom/github/javiersantos/licensing/ResponseData;->g:Ljava/lang/String;

    .line 52
    .line 53
    aget-object v1, p0, v3

    .line 54
    .line 55
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput v1, v0, Lcom/github/javiersantos/licensing/ResponseData;->a:I

    .line 60
    .line 61
    aget-object v1, p0, v2

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iput v1, v0, Lcom/github/javiersantos/licensing/ResponseData;->b:I

    .line 68
    .line 69
    const/4 v1, 0x2

    .line 70
    aget-object v1, p0, v1

    .line 71
    .line 72
    iput-object v1, v0, Lcom/github/javiersantos/licensing/ResponseData;->c:Ljava/lang/String;

    .line 73
    .line 74
    const/4 v1, 0x3

    .line 75
    aget-object v1, p0, v1

    .line 76
    .line 77
    iput-object v1, v0, Lcom/github/javiersantos/licensing/ResponseData;->d:Ljava/lang/String;

    .line 78
    .line 79
    const/4 v1, 0x4

    .line 80
    aget-object v1, p0, v1

    .line 81
    .line 82
    iput-object v1, v0, Lcom/github/javiersantos/licensing/ResponseData;->e:Ljava/lang/String;

    .line 83
    .line 84
    const/4 v1, 0x5

    .line 85
    aget-object p0, p0, v1

    .line 86
    .line 87
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v1

    .line 91
    iput-wide v1, v0, Lcom/github/javiersantos/licensing/ResponseData;->f:J

    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 95
    .line 96
    const-string v0, "Wrong number of fields."

    .line 97
    .line 98
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0
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


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, Lcom/github/javiersantos/licensing/ResponseData;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/github/javiersantos/licensing/ResponseData;->b:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lcom/github/javiersantos/licensing/ResponseData;->c:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/github/javiersantos/licensing/ResponseData;->d:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v4, p0, Lcom/github/javiersantos/licensing/ResponseData;->e:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v5, p0, Lcom/github/javiersantos/licensing/ResponseData;->f:J

    .line 20
    .line 21
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const/4 v6, 0x6

    .line 26
    new-array v6, v6, [Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    aput-object v0, v6, v7

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    aput-object v1, v6, v0

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    aput-object v2, v6, v0

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    aput-object v3, v6, v0

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    aput-object v4, v6, v0

    .line 42
    .line 43
    const/4 v0, 0x5

    .line 44
    aput-object v5, v6, v0

    .line 45
    .line 46
    const-string v0, "|"

    .line 47
    .line 48
    invoke-static {v0, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
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
