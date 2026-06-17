.class public final Ldev/jahir/frames/data/viewmodels/BillingViewModel;
.super Landroidx/lifecycle/a;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lp3/c;
.implements Lp3/o;


# instance fields
.field private billingClient:Lp3/a;

.field private final billingClientReadyData$delegate:Lp4/c;

.field private billingProcessesListener:Ldev/jahir/frames/data/listeners/BillingProcessesListener;

.field private final inAppProductDetailsData$delegate:Lp4/c;

.field private final inAppPurchasesHistoryData$delegate:Lp4/c;

.field private final subscriptionsProductDetailsData$delegate:Lp4/c;

.field private final subscriptionsPurchasesHistoryData$delegate:Lp4/c;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/lifecycle/a;-><init>(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$1;->INSTANCE:Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$1;

    .line 10
    .line 11
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->subscriptionsPurchasesHistoryData$delegate:Lp4/c;

    .line 16
    .line 17
    sget-object p1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$2;->INSTANCE:Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$2;

    .line 18
    .line 19
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->inAppPurchasesHistoryData$delegate:Lp4/c;

    .line 24
    .line 25
    sget-object p1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$3;->INSTANCE:Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$3;

    .line 26
    .line 27
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->inAppProductDetailsData$delegate:Lp4/c;

    .line 32
    .line 33
    sget-object p1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$4;->INSTANCE:Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$4;

    .line 34
    .line 35
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->subscriptionsProductDetailsData$delegate:Lp4/c;

    .line 40
    .line 41
    sget-object p1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$5;->INSTANCE:Ldev/jahir/frames/data/viewmodels/BillingViewModel$special$$inlined$lazyMutableLiveData$5;

    .line 42
    .line 43
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingClientReadyData$delegate:Lp4/c;

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

.method public static final synthetic access$buildQueryProductDetailsParams(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Ljava/util/List;Ljava/lang/String;)Lp3/q;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->buildQueryProductDetailsParams(Ljava/util/List;Ljava/lang/String;)Lp3/q;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic access$getBillingClient$p(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)Lp3/a;
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingClient:Lp3/a;

    .line 2
    .line 3
    return-object p0
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

.method public static final synthetic access$getInAppProductDetailsData(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)Landroidx/lifecycle/i0;
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppProductDetailsData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final synthetic access$getSubscriptionsProductDetailsData(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)Landroidx/lifecycle/i0;
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsProductDetailsData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final synthetic access$handlePurchase(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Lp3/m;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->handlePurchase(Lp3/m;Lt4/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic access$internalQueryProductDetailsList(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Ljava/util/List;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->internalQueryProductDetailsList(Ljava/util/List;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public static final synthetic access$postPurchasesHistory(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->postPurchasesHistory(Ljava/lang/String;Ljava/util/List;)V

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
.end method

.method public static final synthetic access$queryPurchases(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->queryPurchases(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final synthetic access$queryPurchasesHistory(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->queryPurchasesHistory(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method private final buildQueryProductDetailsParams(Ljava/util/List;Ljava/lang/String;)Lp3/q;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lp3/q;"
        }
    .end annotation

    .line 1
    new-instance v0, La1/q;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1}, La1/q;-><init>(CI)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {p1}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    new-instance v3, Lu2/u;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v2, v3, Lu2/u;->h:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object p2, v3, Lu2/u;->i:Ljava/lang/Object;

    .line 42
    .line 43
    const-string v2, "first_party"

    .line 44
    .line 45
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    iget-object v2, v3, Lu2/u;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    iget-object v2, v3, Lu2/u;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    new-instance v2, Lp3/p;

    .line 64
    .line 65
    invoke-direct {v2, v3}, Lp3/p;-><init>(Lu2/u;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    const-string p2, "Product type must be provided."

    .line 75
    .line 76
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    const-string p2, "Product id must be provided."

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    const-string p2, "Serialized doc id must be provided for first party products."

    .line 91
    .line 92
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-nez p1, :cond_8

    .line 101
    .line 102
    new-instance p1, Ljava/util/HashSet;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    const/4 v2, 0x0

    .line 112
    :cond_4
    :goto_1
    if-ge v2, p2, :cond_5

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    add-int/lit8 v2, v2, 0x1

    .line 119
    .line 120
    check-cast v3, Lp3/p;

    .line 121
    .line 122
    iget-object v4, v3, Lp3/p;->b:Ljava/lang/String;

    .line 123
    .line 124
    const-string v5, "play_pass_subs"

    .line 125
    .line 126
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-nez v4, :cond_4

    .line 131
    .line 132
    iget-object v3, v3, Lp3/p;->b:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    invoke-virtual {p1}, Ljava/util/HashSet;->size()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    const/4 p2, 0x1

    .line 143
    if-gt p1, p2, :cond_7

    .line 144
    .line 145
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/zzbt;->n(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iput-object p1, v0, La1/q;->i:Ljava/lang/Object;

    .line 150
    .line 151
    if-eqz p1, :cond_6

    .line 152
    .line 153
    new-instance p1, Lp3/q;

    .line 154
    .line 155
    invoke-direct {p1, v0}, Lp3/q;-><init>(La1/q;)V

    .line 156
    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 160
    .line 161
    const-string p2, "Product list must be set to a non empty list."

    .line 162
    .line 163
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    const-string p2, "All products should be of the same product type."

    .line 170
    .line 171
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 176
    .line 177
    const-string p2, "Product list cannot be empty."

    .line 178
    .line 179
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public static synthetic destroy$default(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Landroidx/lifecycle/w;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->destroy(Landroidx/lifecycle/w;Z)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
.end method

.method private final getBillingClientReadyData()Landroidx/lifecycle/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/i0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingClientReadyData$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/i0;

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

.method private final getInAppProductDetailsData()Landroidx/lifecycle/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/i0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->inAppProductDetailsData$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/i0;

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

.method private final getInAppPurchasesHistoryData()Landroidx/lifecycle/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/i0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->inAppPurchasesHistoryData$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/i0;

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

.method private final getSubscriptionsProductDetailsData()Landroidx/lifecycle/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/i0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->subscriptionsProductDetailsData$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/i0;

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

.method private final getSubscriptionsPurchasesHistoryData()Landroidx/lifecycle/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/i0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->subscriptionsPurchasesHistoryData$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/i0;

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

.method private final handlePurchase(Lp3/m;Lt4/c;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp3/m;",
            "Lt4/c<",
            "-",
            "Lp4/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;

    .line 7
    .line 8
    iget v1, v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Lt4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v2, v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    sget-object v5, Lp4/k;->a:Lp4/k;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lp3/f;

    .line 42
    .line 43
    iget-object p1, v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lp3/m;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catch_0
    nop

    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->isBillingClientReady()Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-nez p2, :cond_3

    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_3
    iget-object p2, p1, Lp3/m;->c:Lorg/json/JSONObject;

    .line 74
    .line 75
    const-string v2, "purchaseState"

    .line 76
    .line 77
    invoke-virtual {p2, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    const/4 v2, 0x4

    .line 82
    if-eq p2, v2, :cond_9

    .line 83
    .line 84
    :try_start_1
    iget-object p2, p1, Lp3/m;->c:Lorg/json/JSONObject;

    .line 85
    .line 86
    const-string v2, "purchaseToken"

    .line 87
    .line 88
    const-string v6, "token"

    .line 89
    .line 90
    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {p2, v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-eqz p2, :cond_8

    .line 99
    .line 100
    new-instance v2, Lp3/f;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object p2, v2, Lp3/f;->a:Ljava/lang/String;

    .line 106
    .line 107
    sget-object p2, Ln5/g0;->a:Lu5/e;

    .line 108
    .line 109
    sget-object p2, Lu5/d;->i:Lu5/d;

    .line 110
    .line 111
    new-instance v6, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$consumeResult$1;

    .line 112
    .line 113
    invoke-direct {v6, p0, v2, v4}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$consumeResult$1;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Lp3/f;Lt4/c;)V

    .line 114
    .line 115
    .line 116
    iput-object p1, v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;->L$0:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v4, v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;->L$1:Ljava/lang/Object;

    .line 119
    .line 120
    iput v3, v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$handlePurchase$1;->label:I

    .line 121
    .line 122
    invoke-static {p2, v6, v0}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    if-ne p2, v1, :cond_4

    .line 127
    .line 128
    return-object v1

    .line 129
    :cond_4
    :goto_1
    check-cast p2, Lp3/g;

    .line 130
    .line 131
    if-eqz p2, :cond_7

    .line 132
    .line 133
    iget-object p2, p2, Lp3/g;->a:Lp3/e;

    .line 134
    .line 135
    if-eqz p2, :cond_7

    .line 136
    .line 137
    iget p2, p2, Lp3/e;->a:I

    .line 138
    .line 139
    if-nez p2, :cond_5

    .line 140
    .line 141
    iget-object p2, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingProcessesListener:Ldev/jahir/frames/data/listeners/BillingProcessesListener;

    .line 142
    .line 143
    if-eqz p2, :cond_6

    .line 144
    .line 145
    invoke-static {p1}, Ldev/jahir/frames/extensions/utils/BillingLibraryKt;->asDetailedPurchase(Lp3/m;)Ldev/jahir/frames/data/models/DetailedPurchaseRecord;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {p2, v0}, Ldev/jahir/frames/data/listeners/BillingProcessesListener;->onProductPurchaseSuccess(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V

    .line 150
    .line 151
    .line 152
    :goto_2
    move-object v4, v5

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    iget-object p2, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingProcessesListener:Ldev/jahir/frames/data/listeners/BillingProcessesListener;

    .line 155
    .line 156
    if-eqz p2, :cond_6

    .line 157
    .line 158
    invoke-static {p1}, Ldev/jahir/frames/extensions/utils/BillingLibraryKt;->asDetailedPurchase(Lp3/m;)Ldev/jahir/frames/data/models/DetailedPurchaseRecord;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-interface {p2, v0}, Ldev/jahir/frames/data/listeners/BillingProcessesListener;->onProductPurchaseError(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_6
    :goto_3
    if-nez v4, :cond_9

    .line 167
    .line 168
    :cond_7
    iget-object p2, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingProcessesListener:Ldev/jahir/frames/data/listeners/BillingProcessesListener;

    .line 169
    .line 170
    if-eqz p2, :cond_9

    .line 171
    .line 172
    invoke-static {p1}, Ldev/jahir/frames/extensions/utils/BillingLibraryKt;->asDetailedPurchase(Lp3/m;)Ldev/jahir/frames/data/models/DetailedPurchaseRecord;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-interface {p2, v0}, Ldev/jahir/frames/data/listeners/BillingProcessesListener;->onProductPurchaseError(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V

    .line 177
    .line 178
    .line 179
    return-object v5

    .line 180
    :cond_8
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 181
    .line 182
    const-string v0, "Purchase token must be set"

    .line 183
    .line 184
    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 188
    :goto_4
    iget-object p2, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingProcessesListener:Ldev/jahir/frames/data/listeners/BillingProcessesListener;

    .line 189
    .line 190
    if-eqz p2, :cond_9

    .line 191
    .line 192
    invoke-static {p1}, Ldev/jahir/frames/extensions/utils/BillingLibraryKt;->asDetailedPurchase(Lp3/m;)Ldev/jahir/frames/data/models/DetailedPurchaseRecord;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-interface {p2, p1}, Ldev/jahir/frames/data/listeners/BillingProcessesListener;->onProductPurchaseError(Ldev/jahir/frames/data/models/DetailedPurchaseRecord;)V

    .line 197
    .line 198
    .line 199
    :cond_9
    :goto_5
    return-object v5
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method private final internalQueryProductDetailsList(Ljava/util/List;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Lp4/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->isBillingClientReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 15
    .line 16
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 17
    .line 18
    new-instance v1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$internalQueryProductDetailsList$2;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, p1, p2, v2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$internalQueryProductDetailsList$2;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Ljava/util/List;Ljava/lang/String;Lt4/c;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, p3}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1
    :goto_0
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 30
    .line 31
    return-object p1
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
.end method

.method private final postPurchasesHistory(Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/DetailedPurchaseRecord;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const-string v1, "inapp"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, "subs"

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppPurchasesHistory()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p1, v3}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsPurchasesHistory()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    sget-object v2, Lq4/r;->h:Lq4/r;

    .line 30
    .line 31
    :goto_0
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance p2, Ldev/jahir/frames/data/viewmodels/BillingViewModel$postPurchasesHistory$$inlined$sortedByDescending$1;

    .line 48
    .line 49
    invoke-direct {p2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$postPurchasesHistory$$inlined$sortedByDescending$1;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, p2}, Lq4/i;->C0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p1, p2}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    invoke-static {p1, v3}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p2, Ldev/jahir/frames/data/viewmodels/BillingViewModel$postPurchasesHistory$$inlined$sortedByDescending$2;

    .line 71
    .line 72
    invoke-direct {p2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$postPurchasesHistory$$inlined$sortedByDescending$2;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p2}, Lq4/i;->C0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p1, p2}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method private final queryPurchases(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Lp4/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->isBillingClientReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v0, La1/u;

    .line 11
    .line 12
    invoke-direct {v0}, La1/u;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La1/u;->i:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance v1, Lp3/s;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lp3/s;-><init>(La1/u;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 25
    .line 26
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 27
    .line 28
    new-instance v2, Ldev/jahir/frames/data/viewmodels/BillingViewModel$queryPurchases$2;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v2, p0, v1, p1, v3}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$queryPurchases$2;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Lp3/s;Ljava/lang/String;Lt4/c;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v2, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p2, "Product type must be set"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
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

.method private final queryPurchasesHistory(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Lp4/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->isBillingClientReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v0, La1/u;

    .line 11
    .line 12
    invoke-direct {v0}, La1/u;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La1/u;->i:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance v1, Lp3/s;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lp3/s;-><init>(La1/u;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 25
    .line 26
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 27
    .line 28
    new-instance v2, Ldev/jahir/frames/data/viewmodels/BillingViewModel$queryPurchasesHistory$2;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v2, p0, v1, p1, v3}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$queryPurchasesHistory$2;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Lp3/s;Ljava/lang/String;Lt4/c;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v2, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    const-string p2, "Product type must be set"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
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
.method public final destroy(Landroidx/lifecycle/w;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppProductDetailsData()Landroidx/lifecycle/i0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->k(Landroidx/lifecycle/w;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->k(Landroidx/lifecycle/w;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsProductDetailsData()Landroidx/lifecycle/i0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->k(Landroidx/lifecycle/w;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->k(Landroidx/lifecycle/w;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getBillingClientReadyData()Landroidx/lifecycle/i0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->k(Landroidx/lifecycle/w;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    if-eqz p2, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingClient:Lp3/a;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lp3/a;->b()V

    .line 45
    .line 46
    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingClient:Lp3/a;

    .line 49
    .line 50
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingProcessesListener:Ldev/jahir/frames/data/listeners/BillingProcessesListener;

    .line 51
    .line 52
    :cond_2
    return-void
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

.method public final getBillingProcessesListener()Ldev/jahir/frames/data/listeners/BillingProcessesListener;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingProcessesListener:Ldev/jahir/frames/data/listeners/BillingProcessesListener;

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

.method public final getInAppProductDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppProductDetailsData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/f0;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lq4/r;->h:Lq4/r;

    .line 14
    .line 15
    :cond_0
    return-object v0
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

.method public final getInAppPurchasesHistory()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/DetailedPurchaseRecord;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/f0;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lq4/r;->h:Lq4/r;

    .line 14
    .line 15
    :cond_0
    return-object v0
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

.method public final getSubscriptionsProductDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lp3/l;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsProductDetailsData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/f0;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lq4/r;->h:Lq4/r;

    .line 14
    .line 15
    :cond_0
    return-object v0
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

.method public final getSubscriptionsPurchasesHistory()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/DetailedPurchaseRecord;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/f0;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lq4/r;->h:Lq4/r;

    .line 14
    .line 15
    :cond_0
    return-object v0
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

.method public final initialize()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La1/h;

    .line 6
    .line 7
    invoke-direct {v1, v0}, La1/h;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p0, v1, La1/h;->c:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v2, Lk6/f;

    .line 13
    .line 14
    const/16 v3, 0xb

    .line 15
    .line 16
    invoke-direct {v2, v3}, Lk6/f;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, v1, La1/h;->a:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    iget-object v2, v1, La1/h;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 26
    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    iget-object v2, v1, La1/h;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lk6/f;

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    iget-object v2, v1, La1/h;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lk6/f;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v2, v1, La1/h;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget-object v2, v1, La1/h;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lk6/f;

    .line 51
    .line 52
    iget-object v3, v1, La1/h;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Ldev/jahir/frames/data/viewmodels/BillingViewModel;

    .line 55
    .line 56
    invoke-virtual {v1}, La1/h;->a()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    new-instance v4, Lp3/c0;

    .line 63
    .line 64
    invoke-direct {v4, v2, v0, v3, v1}, Lp3/c0;-><init>(Lk6/f;Landroid/content/Context;Lp3/o;La1/h;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    new-instance v4, Lp3/b;

    .line 69
    .line 70
    invoke-direct {v4, v2, v0, v3, v1}, Lp3/b;-><init>(Lk6/f;Landroid/content/Context;Lp3/o;La1/h;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v2, v1, La1/h;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lk6/f;

    .line 77
    .line 78
    invoke-virtual {v1}, La1/h;->a()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    new-instance v4, Lp3/c0;

    .line 85
    .line 86
    invoke-direct {v4, v2, v0, v1}, Lp3/c0;-><init>(Lk6/f;Landroid/content/Context;La1/h;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    new-instance v4, Lp3/b;

    .line 91
    .line 92
    invoke-direct {v4, v2, v0, v1}, Lp3/b;-><init>(Lk6/f;Landroid/content/Context;La1/h;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    iput-object v4, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingClient:Lp3/a;

    .line 96
    .line 97
    invoke-virtual {v4, p0}, Lp3/b;->f(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    const-string v1, "Pending purchases for one-time products must be supported."

    .line 104
    .line 105
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    const-string v1, "Please provide a valid listener for purchases updates."

    .line 112
    .line 113
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v0

    .line 117
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 118
    .line 119
    const-string v1, "Please provide a valid Context."

    .line 120
    .line 121
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v0
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

.method public final isBillingClientReady()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getBillingClientReadyData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/lifecycle/f0;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingClient:Lp3/a;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    check-cast v0, Lp3/b;

    .line 22
    .line 23
    invoke-virtual {v0}, Lp3/b;->r()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    return v1

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0
    .line 33
.end method

.method public final launchBillingFlow(Landroidx/fragment/app/q0;Lp3/l;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_3

    .line 4
    .line 5
    :cond_0
    if-nez p2, :cond_1

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingClient:Lp3/a;

    .line 10
    .line 11
    if-eqz v0, :cond_b

    .line 12
    .line 13
    new-instance v1, Lu2/e;

    .line 14
    .line 15
    const/4 v2, 0x7

    .line 16
    invoke-direct {v1, v2}, Lu2/e;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p2, v1, Lu2/e;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {p2}, Lp3/l;->a()Lp3/h;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p2}, Lp3/l;->a()Lp3/h;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lp3/l;->a()Lp3/h;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iget-object p2, p2, Lp3/h;->c:Ljava/lang/String;

    .line 39
    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    iput-object p2, v1, Lu2/e;->c:Ljava/lang/Object;

    .line 43
    .line 44
    :cond_2
    new-instance p2, Lp3/d;

    .line 45
    .line 46
    invoke-direct {p2, v1}, Lp3/d;-><init>(Lu2/e;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, Lq3/a;->Q(Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    new-instance v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-nez p2, :cond_a

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    :goto_0
    if-ge v4, v2, :cond_4

    .line 71
    .line 72
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    check-cast v5, Lp3/d;

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 84
    .line 85
    const-string p2, "ProductDetailsParams cannot be null."

    .line 86
    .line 87
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_4
    new-instance v2, Landroidx/room/z;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    const/4 v4, 0x1

    .line 97
    if-nez p2, :cond_5

    .line 98
    .line 99
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, Lp3/d;

    .line 104
    .line 105
    iget-object p2, p2, Lp3/d;->a:Lp3/l;

    .line 106
    .line 107
    iget-object p2, p2, Lp3/l;->b:Lorg/json/JSONObject;

    .line 108
    .line 109
    const-string v5, "packageName"

    .line 110
    .line 111
    invoke-virtual {p2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-nez p2, :cond_5

    .line 120
    .line 121
    const/4 p2, 0x1

    .line 122
    goto :goto_1

    .line 123
    :cond_5
    const/4 p2, 0x0

    .line 124
    :goto_1
    iput-boolean p2, v2, Landroidx/room/z;->a:Z

    .line 125
    .line 126
    const/4 p2, 0x0

    .line 127
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_6

    .line 132
    .line 133
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-nez v5, :cond_7

    .line 138
    .line 139
    :cond_6
    const/4 v3, 0x1

    .line 140
    :cond_7
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-eqz v3, :cond_9

    .line 145
    .line 146
    if-eqz p2, :cond_8

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 150
    .line 151
    const-string p2, "Please provide Old SKU purchase information(token/id) or original external transaction id, not both."

    .line 152
    .line 153
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p1

    .line 157
    :cond_9
    :goto_2
    new-instance p2, Lk6/f;

    .line 158
    .line 159
    const/16 v3, 0xa

    .line 160
    .line 161
    invoke-direct {p2, v3}, Lk6/f;-><init>(I)V

    .line 162
    .line 163
    .line 164
    iput-object p2, v2, Landroidx/room/z;->c:Ljava/lang/Object;

    .line 165
    .line 166
    new-instance p2, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object p2, v2, Landroidx/room/z;->b:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/zzbt;->n(Ljava/util/ArrayList;)Lcom/google/android/gms/internal/play_billing/zzbt;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    iput-object p2, v2, Landroidx/room/z;->d:Ljava/lang/Object;

    .line 178
    .line 179
    invoke-virtual {v0, p1, v2}, Lp3/a;->c(Landroid/app/Activity;Landroidx/room/z;)Lp3/e;

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 184
    .line 185
    const-string p2, "Details of the products must be provided."

    .line 186
    .line 187
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_b
    :goto_3
    return-void
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final loadPastPurchases()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->isBillingClientReady()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/t0;->g(Landroidx/lifecycle/z0;)Lk1/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$loadPastPurchases$1;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$loadPastPurchases$1;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Lt4/c;)V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    invoke-static {v0, v2, v2, v1, v3}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 20
    .line 21
    .line 22
    return-void
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

.method public final observe(Landroidx/lifecycle/w;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->destroy(Landroidx/lifecycle/w;Z)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getBillingClientReadyData()Landroidx/lifecycle/i0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$1;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$1;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;-><init>(Ld5/l;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v2}, Landroidx/lifecycle/f0;->e(Landroidx/lifecycle/w;Landroidx/lifecycle/j0;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppProductDetailsData()Landroidx/lifecycle/i0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$2;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$2;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;

    .line 35
    .line 36
    invoke-direct {v2, v1}, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;-><init>(Ld5/l;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1, v2}, Landroidx/lifecycle/f0;->e(Landroidx/lifecycle/w;Landroidx/lifecycle/j0;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$3;

    .line 47
    .line 48
    invoke-direct {v1, p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$3;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;

    .line 52
    .line 53
    invoke-direct {v2, v1}, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;-><init>(Ld5/l;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1, v2}, Landroidx/lifecycle/f0;->e(Landroidx/lifecycle/w;Landroidx/lifecycle/j0;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsProductDetailsData()Landroidx/lifecycle/i0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$4;

    .line 64
    .line 65
    invoke-direct {v1, p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$4;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)V

    .line 66
    .line 67
    .line 68
    new-instance v2, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;

    .line 69
    .line 70
    invoke-direct {v2, v1}, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;-><init>(Ld5/l;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1, v2}, Landroidx/lifecycle/f0;->e(Landroidx/lifecycle/w;Landroidx/lifecycle/j0;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$5;

    .line 81
    .line 82
    invoke-direct {v1, p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$observe$$inlined$tryToObserve$5;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;

    .line 86
    .line 87
    invoke-direct {v2, v1}, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;-><init>(Ld5/l;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1, v2}, Landroidx/lifecycle/f0;->e(Landroidx/lifecycle/w;Landroidx/lifecycle/j0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_0
    move-exception p1

    .line 95
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    return-void
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

.method public onBillingServiceDisconnected()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getBillingClientReadyData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppProductDetailsData()Landroidx/lifecycle/i0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getInAppPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsProductDetailsData()Landroidx/lifecycle/i0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getSubscriptionsPurchasesHistoryData()Landroidx/lifecycle/i0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
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

.method public onBillingSetupFinished(Lp3/e;)V
    .locals 1

    .line 1
    const-string v0, "billingResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->getBillingClientReadyData()Landroidx/lifecycle/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget p1, p1, Lp3/e;->a:I

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public onPurchasesUpdated(Lp3/e;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp3/e;",
            "Ljava/util/List<",
            "Lp3/m;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "billingResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget p1, p1, Lp3/e;->a:I

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    invoke-static {p0}, Landroidx/lifecycle/t0;->g(Landroidx/lifecycle/z0;)Lk1/a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Ldev/jahir/frames/data/viewmodels/BillingViewModel$onPurchasesUpdated$1;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p2, p0, v1}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$onPurchasesUpdated$1;-><init>(Ljava/util/List;Ldev/jahir/frames/data/viewmodels/BillingViewModel;Lt4/c;)V

    .line 27
    .line 28
    .line 29
    const/4 p2, 0x3

    .line 30
    invoke-static {p1, v1, v1, v0, p2}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->loadPastPurchases()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
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

.method public final queryInAppProductDetailsList(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "productItemsIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/t0;->g(Landroidx/lifecycle/z0;)Lk1/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$queryInAppProductDetailsList$1;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$queryInAppProductDetailsList$1;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Ljava/util/List;Lt4/c;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    invoke-static {v0, v2, v2, v1, p1}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 18
    .line 19
    .line 20
    return-void
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

.method public final querySubscriptionsProductDetailsList(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "productItemsIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/t0;->g(Landroidx/lifecycle/z0;)Lk1/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ldev/jahir/frames/data/viewmodels/BillingViewModel$querySubscriptionsProductDetailsList$1;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/data/viewmodels/BillingViewModel$querySubscriptionsProductDetailsList$1;-><init>(Ldev/jahir/frames/data/viewmodels/BillingViewModel;Ljava/util/List;Lt4/c;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    invoke-static {v0, v2, v2, v1, p1}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 18
    .line 19
    .line 20
    return-void
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

.method public final setBillingProcessesListener(Ldev/jahir/frames/data/listeners/BillingProcessesListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/BillingViewModel;->billingProcessesListener:Ldev/jahir/frames/data/listeners/BillingProcessesListener;

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
