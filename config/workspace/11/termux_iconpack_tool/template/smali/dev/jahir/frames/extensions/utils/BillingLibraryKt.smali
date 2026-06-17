.class public final Ldev/jahir/frames/extensions/utils/BillingLibraryKt;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public static final asDetailedPurchase(Lp3/m;)Ldev/jahir/frames/data/models/DetailedPurchaseRecord;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 3
    iget-object v1, p0, Lp3/m;->a:Ljava/lang/String;

    .line 4
    const-class v2, Ldev/jahir/frames/data/models/PseudoDetailedPurchaseRecord;

    .line 5
    invoke-static {v2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->b(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    .line 6
    move-object v2, v0

    check-cast v2, Ldev/jahir/frames/data/models/PseudoDetailedPurchaseRecord;

    .line 7
    new-instance v1, Ldev/jahir/frames/data/models/InternalDetailedPurchaseRecord;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Ldev/jahir/frames/data/models/InternalDetailedPurchaseRecord;-><init>(Ldev/jahir/frames/data/models/PseudoDetailedPurchaseRecord;Lp3/m;ZILkotlin/jvm/internal/e;)V

    .line 8
    new-instance p0, Lcom/google/gson/Gson;

    invoke-direct {p0}, Lcom/google/gson/Gson;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ldev/jahir/frames/data/models/InternalDetailedPurchaseRecord;->toJSONString(I)Ljava/lang/String;

    move-result-object v0

    const-class v1, Ldev/jahir/frames/data/models/DetailedPurchaseRecord;

    .line 9
    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/gson/Gson;->b(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p0

    .line 10
    check-cast p0, Ldev/jahir/frames/data/models/DetailedPurchaseRecord;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final asDetailedPurchase(Lp3/n;)Ldev/jahir/frames/data/models/DetailedPurchaseRecord;
    .locals 1

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final getPrice(Lp3/l;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp3/l;->d:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "inapp"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lp3/l;->a()Lp3/h;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_3

    .line 21
    .line 22
    iget-object p0, p0, Lp3/h;->a:Ljava/lang/String;

    .line 23
    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object p0

    .line 28
    :cond_1
    iget-object p0, p0, Lp3/l;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-eqz p0, :cond_3

    .line 31
    .line 32
    invoke-static {p0}, Lq4/i;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lp3/k;

    .line 37
    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    iget-object p0, p0, Lp3/k;->a:Lp3/j;

    .line 41
    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    iget-object p0, p0, Lp3/j;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-static {p0}, Lq4/i;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Lp3/i;

    .line 53
    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    iget-object p0, p0, Lp3/i;->a:Ljava/lang/String;

    .line 57
    .line 58
    if-nez p0, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-object p0

    .line 62
    :cond_3
    :goto_0
    const-string p0, "0"

    .line 63
    .line 64
    return-object p0
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

.method public static final getPriceAmountMicros(Lp3/l;)J
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp3/l;->d:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "inapp"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lp3/l;->a()Lp3/h;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-wide v0, p0, Lp3/h;->b:J

    .line 23
    .line 24
    return-wide v0

    .line 25
    :cond_0
    iget-object p0, p0, Lp3/l;->h:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-static {p0}, Lq4/i;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lp3/k;

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lp3/k;->a:Lp3/j;

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    iget-object p0, p0, Lp3/j;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    invoke-static {p0}, Lq4/i;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lp3/i;

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    iget-wide v0, p0, Lp3/i;->b:J

    .line 54
    .line 55
    return-wide v0

    .line 56
    :cond_1
    const-wide/16 v0, 0x0

    .line 57
    .line 58
    return-wide v0
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

.method public static final purchaseStateToText(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const-string p0, "Unspecified"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "Pending"

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    const-string p0, "Purchased"

    .line 14
    .line 15
    return-object p0
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
