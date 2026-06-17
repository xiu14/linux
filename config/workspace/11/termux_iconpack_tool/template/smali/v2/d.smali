.class public final synthetic Lv2/d;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lv2/e;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lv2/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv2/d;->a:Lv2/e;

    .line 5
    .line 6
    iput p2, p0, Lv2/d;->b:I

    .line 7
    .line 8
    return-void
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
.method public final call()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lv2/d;->a:Lv2/e;

    .line 2
    .line 3
    iget-object v0, v0, Lv2/e;->a:Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()Lu2/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "next_job_scheduler_id"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lu2/e;->c(Ljava/lang/String;)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    long-to-int v1, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    :goto_0
    const v4, 0x7fffffff

    .line 26
    .line 27
    .line 28
    if-ne v1, v4, :cond_1

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v4, v1, 0x1

    .line 33
    .line 34
    :goto_1
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()Lu2/e;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    new-instance v6, Lu2/d;

    .line 39
    .line 40
    int-to-long v7, v4

    .line 41
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-direct {v6, v2, v4}, Lu2/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v6}, Lu2/e;->d(Lu2/d;)V

    .line 49
    .line 50
    .line 51
    if-ltz v1, :cond_2

    .line 52
    .line 53
    iget v4, p0, Lv2/d;->b:I

    .line 54
    .line 55
    if-gt v1, v4, :cond_2

    .line 56
    .line 57
    move v3, v1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()Lu2/e;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, Lu2/d;

    .line 64
    .line 65
    const/4 v4, 0x1

    .line 66
    int-to-long v4, v4

    .line 67
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-direct {v1, v2, v4}, Lu2/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lu2/e;->d(Lu2/d;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0
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
