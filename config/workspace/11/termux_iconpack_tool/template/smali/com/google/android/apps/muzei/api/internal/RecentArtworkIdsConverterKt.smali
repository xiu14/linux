.class public final Lcom/google/android/apps/muzei/api/internal/RecentArtworkIdsConverterKt;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public static final a(Landroid/content/SharedPreferences;)Ljava/util/ArrayDeque;
    .locals 5

    .line 1
    const-string v0, "recentArtworkIds"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const-string p0, ""

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [C

    .line 19
    .line 20
    const/16 v2, 0x2c

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    aput-char v2, v1, v3

    .line 24
    .line 25
    invoke-static {p0, v1}, Ll5/e;->x0(Ljava/lang/CharSequence;[C)Lk5/n;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Ldev/jahir/blueprint/ui/activities/d;

    .line 30
    .line 31
    const/16 v3, 0xb

    .line 32
    .line 33
    invoke-direct {v2, p0, v3}, Ldev/jahir/blueprint/ui/activities/d;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lk5/j;->M(Lk5/h;Ld5/l;)Lk5/n;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object v1, Lcom/google/android/apps/muzei/api/internal/RecentArtworkIdsConverterKt$toRecentIds$1;->h:Lcom/google/android/apps/muzei/api/internal/RecentArtworkIdsConverterKt$toRecentIds$1;

    .line 41
    .line 42
    invoke-static {p0, v1}, Lk5/j;->K(Lk5/h;Ld5/l;)Lk5/e;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v1, Lcom/google/android/apps/muzei/api/internal/RecentArtworkIdsConverterKt$toRecentIds$2;->h:Lcom/google/android/apps/muzei/api/internal/RecentArtworkIdsConverterKt$toRecentIds$2;

    .line 47
    .line 48
    invoke-static {p0, v1}, Lk5/j;->M(Lk5/h;Ld5/l;)Lk5/n;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object v1, p0, Lk5/n;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lk5/h;

    .line 55
    .line 56
    invoke-interface {v1}, Lk5/h;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    iget-object v2, p0, Lk5/n;->c:Lp4/a;

    .line 67
    .line 68
    check-cast v2, Ld5/l;

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v2, v3}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    return-object v0
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
