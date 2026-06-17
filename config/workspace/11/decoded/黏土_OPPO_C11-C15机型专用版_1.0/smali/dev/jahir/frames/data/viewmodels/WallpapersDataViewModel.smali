.class public Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;
.super Landroidx/lifecycle/a;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$DataError;
    }
.end annotation


# instance fields
.field private final collectionsData$delegate:Lp4/c;

.field private errorListener:Ld5/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/l;"
        }
    .end annotation
.end field

.field private final favoritesData$delegate:Lp4/c;

.field private final service$delegate:Lp4/c;

.field private final wallpapersData$delegate:Lp4/c;

.field private whenReady:Ld5/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/a;"
        }
    .end annotation
.end field


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
    sget-object p1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$special$$inlined$lazyMutableLiveData$1;->INSTANCE:Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$special$$inlined$lazyMutableLiveData$1;

    .line 10
    .line 11
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->wallpapersData$delegate:Lp4/c;

    .line 16
    .line 17
    sget-object p1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$special$$inlined$lazyMutableLiveData$2;->INSTANCE:Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$special$$inlined$lazyMutableLiveData$2;

    .line 18
    .line 19
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->collectionsData$delegate:Lp4/c;

    .line 24
    .line 25
    sget-object p1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$special$$inlined$lazyMutableLiveData$3;->INSTANCE:Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$special$$inlined$lazyMutableLiveData$3;

    .line 26
    .line 27
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->favoritesData$delegate:Lp4/c;

    .line 32
    .line 33
    new-instance p1, La2/c;

    .line 34
    .line 35
    const/16 v0, 0xf

    .line 36
    .line 37
    invoke-direct {p1, v0}, La2/c;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Le6/d;->A(Ld5/a;)Lp4/i;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->service$delegate:Lp4/c;

    .line 45
    .line 46
    return-void
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
.end method

.method public static synthetic a()Ldev/jahir/frames/data/network/WallpapersJSONService;
    .locals 1

    .line 1
    invoke-static {}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->service_delegate$lambda$0()Ldev/jahir/frames/data/network/WallpapersJSONService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static final synthetic access$deleteAllWallpapers(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->deleteAllWallpapers(Lt4/c;)Ljava/lang/Object;

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
.end method

.method public static final synthetic access$getFavorites(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getFavorites(Lt4/c;)Ljava/lang/Object;

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
.end method

.method public static final synthetic access$getNextWallpaperInCollection(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getNextWallpaperInCollection(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;

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

.method public static final synthetic access$getPreviousWallpaperInCollection(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getPreviousWallpaperInCollection(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;

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

.method public static final synthetic access$getWallpapersFromDatabase(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapersFromDatabase(Lt4/c;)Ljava/lang/Object;

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
.end method

.method public static final synthetic access$handleWallpapersData(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;ZZLjava/util/List;ZZLt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->handleWallpapersData(ZZLjava/util/List;ZZLt4/c;)Ljava/lang/Object;

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
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
.end method

.method public static final synthetic access$internalAddToLocalFavorites(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/util/List;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->internalAddToLocalFavorites(Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final synthetic access$internalNukeAllLocalFavorites(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->internalNukeAllLocalFavorites()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final synthetic access$loadRemoteData(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;ZZZZLt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->loadRemoteData(Ljava/lang/String;ZZZZLt4/c;)Ljava/lang/Object;

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
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
.end method

.method public static final synthetic access$safeAddToFavorites(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->safeAddToFavorites(Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;

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

.method public static final synthetic access$safeRemoveFromFavorites(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->safeRemoveFromFavorites(Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;

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

.method public static final synthetic access$saveWallpapers(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/util/List;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->saveWallpapers(Ljava/util/List;Lt4/c;)Ljava/lang/Object;

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

.method public static final synthetic access$transformWallpapersToCollections(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/util/List;Lt4/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->transformWallpapersToCollections(Ljava/util/List;Lt4/c;)Ljava/lang/Object;

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

.method private final areTheSameLists(Ljava/util/List;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Ljava/util/List<",
            "+TT;>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    add-int/lit8 v3, v2, 0x1

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-interface {p1, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eq v4, v2, :cond_0

    .line 24
    .line 25
    return v0

    .line 26
    :cond_0
    move v2, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lq4/i;->J0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-gtz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    if-ne p2, p1, :cond_2

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :catch_0
    :cond_2
    return v0
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

.method public static synthetic b(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;)Lp4/k;
    .locals 0

    .line 1
    invoke-static {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->handleWallpapersData$lambda$19(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;)Lp4/k;

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

.method private final deleteAllWallpapers(Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Lp4/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$deleteAllWallpapers$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$deleteAllWallpapers$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private final getCollectionsData()Landroidx/lifecycle/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/i0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->collectionsData$delegate:Lp4/c;

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

.method private final getFavorites(Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Favorite;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getFavorites$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getFavorites$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)V

    invoke-static {v0, v1, p1}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final getFavoritesData()Landroidx/lifecycle/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/i0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->favoritesData$delegate:Lp4/c;

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

.method public static synthetic getNextWallpaper$default(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Ljava/lang/String;Lt4/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getNextWallpaper(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: getNextWallpaper"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
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
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method private final getNextWallpaperInCollection(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getNextWallpaperInCollection$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getNextWallpaperInCollection$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Ljava/lang/String;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public static synthetic getPreviousWallpaper$default(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Ljava/lang/String;Lt4/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getPreviousWallpaper(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: getPreviousWallpaper"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
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
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method private final getPreviousWallpaperInCollection(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getPreviousWallpaperInCollection$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getPreviousWallpaperInCollection$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Ljava/lang/String;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private final getService()Ldev/jahir/frames/data/network/WallpapersJSONService;
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->service$delegate:Lp4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lp4/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldev/jahir/frames/data/network/WallpapersJSONService;

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

.method private final getWallpapersData()Landroidx/lifecycle/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/i0;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->wallpapersData$delegate:Lp4/c;

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

.method private final getWallpapersFromDatabase(Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getWallpapersFromDatabase$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getWallpapersFromDatabase$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private final handleWallpapersData(ZZLjava/util/List;ZZLt4/c;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;ZZ",
            "Lt4/c<",
            "-",
            "Lp4/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;

    .line 11
    .line 12
    iget v3, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lu4/a;->h:Lu4/a;

    .line 32
    .line 33
    iget v4, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v9, 0x1

    .line 39
    const/4 v10, 0x0

    .line 40
    if-eqz v4, :cond_5

    .line 41
    .line 42
    if-eq v4, v9, :cond_4

    .line 43
    .line 44
    if-eq v4, v7, :cond_3

    .line 45
    .line 46
    if-eq v4, v6, :cond_2

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    iget-object v3, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$4:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Ljava/util/List;

    .line 53
    .line 54
    iget-object v3, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$3:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Ljava/util/List;

    .line 57
    .line 58
    iget-object v3, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$2:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Ljava/util/List;

    .line 61
    .line 62
    iget-object v3, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$1:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, Ljava/util/List;

    .line 65
    .line 66
    iget-object v2, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_17

    .line 74
    .line 75
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_2
    iget-boolean v4, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$3:Z

    .line 84
    .line 85
    iget-boolean v6, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$2:Z

    .line 86
    .line 87
    iget-boolean v7, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$1:Z

    .line 88
    .line 89
    iget-boolean v8, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$0:Z

    .line 90
    .line 91
    iget-object v9, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$4:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v9, Ljava/util/List;

    .line 94
    .line 95
    iget-object v11, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$3:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v11, Ljava/util/List;

    .line 98
    .line 99
    iget-object v12, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$2:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v12, Ljava/util/List;

    .line 102
    .line 103
    iget-object v12, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$1:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v12, Ljava/util/List;

    .line 106
    .line 107
    iget-object v13, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$0:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v13, Ljava/util/List;

    .line 110
    .line 111
    invoke-static {v1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_f

    .line 115
    .line 116
    :cond_3
    iget-boolean v4, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$3:Z

    .line 117
    .line 118
    iget-boolean v7, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$2:Z

    .line 119
    .line 120
    iget-boolean v11, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$1:Z

    .line 121
    .line 122
    iget-boolean v12, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$0:Z

    .line 123
    .line 124
    iget-object v13, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$2:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v13, Ljava/util/List;

    .line 127
    .line 128
    iget-object v14, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$1:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v14, Ljava/util/List;

    .line 131
    .line 132
    iget-object v15, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$0:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v15, Ljava/util/List;

    .line 135
    .line 136
    invoke-static {v1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_a

    .line 140
    .line 141
    :cond_4
    iget-boolean v4, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$3:Z

    .line 142
    .line 143
    iget-boolean v11, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$2:Z

    .line 144
    .line 145
    iget-boolean v12, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$1:Z

    .line 146
    .line 147
    iget-boolean v13, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$0:Z

    .line 148
    .line 149
    iget-object v14, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$0:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v14, Ljava/util/List;

    .line 152
    .line 153
    :try_start_0
    invoke-static {v1}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    .line 155
    .line 156
    move/from16 v18, v12

    .line 157
    .line 158
    move v12, v11

    .line 159
    move/from16 v11, v18

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :catch_0
    move v1, v13

    .line 163
    move v13, v4

    .line 164
    move v4, v1

    .line 165
    move v1, v12

    .line 166
    move v12, v11

    .line 167
    move v11, v1

    .line 168
    :goto_1
    move-object v1, v14

    .line 169
    goto :goto_6

    .line 170
    :cond_5
    invoke-static {v1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    move-object/from16 v1, p3

    .line 174
    .line 175
    :try_start_1
    iput-object v1, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$0:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5

    .line 176
    .line 177
    move/from16 v4, p1

    .line 178
    .line 179
    :try_start_2
    iput-boolean v4, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$0:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 180
    .line 181
    move/from16 v11, p2

    .line 182
    .line 183
    :try_start_3
    iput-boolean v11, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$1:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 184
    .line 185
    move/from16 v12, p4

    .line 186
    .line 187
    :try_start_4
    iput-boolean v12, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$2:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 188
    .line 189
    move/from16 v13, p5

    .line 190
    .line 191
    :try_start_5
    iput-boolean v13, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$3:Z

    .line 192
    .line 193
    iput v9, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->label:I

    .line 194
    .line 195
    invoke-direct {v0, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapersFromDatabase(Lt4/c;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v14
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    .line 199
    if-ne v14, v3, :cond_6

    .line 200
    .line 201
    goto/16 :goto_16

    .line 202
    .line 203
    :cond_6
    move-object/from16 v18, v14

    .line 204
    .line 205
    move-object v14, v1

    .line 206
    move-object/from16 v1, v18

    .line 207
    .line 208
    move/from16 v18, v13

    .line 209
    .line 210
    move v13, v4

    .line 211
    move/from16 v4, v18

    .line 212
    .line 213
    :goto_2
    :try_start_6
    check-cast v1, Ljava/util/List;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 214
    .line 215
    move-object/from16 v18, v14

    .line 216
    .line 217
    move-object v14, v1

    .line 218
    move-object/from16 v1, v18

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :catch_1
    move v1, v13

    .line 222
    move v13, v4

    .line 223
    move v4, v1

    .line 224
    goto :goto_1

    .line 225
    :catch_2
    :goto_3
    move/from16 v13, p5

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :catch_3
    :goto_4
    move/from16 v12, p4

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :catch_4
    :goto_5
    move/from16 v11, p2

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :catch_5
    move/from16 v4, p1

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :catch_6
    :goto_6
    new-instance v14, Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 240
    .line 241
    .line 242
    move/from16 v18, v13

    .line 243
    .line 244
    move v13, v4

    .line 245
    move/from16 v4, v18

    .line 246
    .line 247
    :goto_7
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    if-nez v15, :cond_a

    .line 252
    .line 253
    new-instance v15, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    :cond_7
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v16

    .line 266
    if-eqz v16, :cond_8

    .line 267
    .line 268
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    move-object/from16 v16, v8

    .line 273
    .line 274
    check-cast v16, Ldev/jahir/frames/data/models/Wallpaper;

    .line 275
    .line 276
    invoke-virtual/range {v16 .. v16}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v16

    .line 280
    invoke-static/range {v16 .. v16}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result v16

    .line 284
    if-eqz v16, :cond_7

    .line 285
    .line 286
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_8
    new-instance v1, Ljava/util/HashSet;

    .line 291
    .line 292
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 293
    .line 294
    .line 295
    new-instance v8, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 301
    .line 302
    .line 303
    move-result v9

    .line 304
    const/4 v5, 0x0

    .line 305
    :goto_9
    if-ge v5, v9, :cond_b

    .line 306
    .line 307
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    add-int/lit8 v5, v5, 0x1

    .line 312
    .line 313
    move-object/from16 v17, v6

    .line 314
    .line 315
    check-cast v17, Ldev/jahir/frames/data/models/Wallpaper;

    .line 316
    .line 317
    invoke-virtual/range {v17 .. v17}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v7

    .line 325
    if-eqz v7, :cond_9

    .line 326
    .line 327
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_9
    const/4 v6, 0x3

    .line 331
    const/4 v7, 0x2

    .line 332
    goto :goto_9

    .line 333
    :cond_a
    move-object v8, v14

    .line 334
    :cond_b
    if-eqz v11, :cond_d

    .line 335
    .line 336
    iput-object v10, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$0:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object v14, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$1:Ljava/lang/Object;

    .line 339
    .line 340
    iput-object v8, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$2:Ljava/lang/Object;

    .line 341
    .line 342
    iput-boolean v13, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$0:Z

    .line 343
    .line 344
    iput-boolean v11, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$1:Z

    .line 345
    .line 346
    iput-boolean v12, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$2:Z

    .line 347
    .line 348
    iput-boolean v4, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$3:Z

    .line 349
    .line 350
    const/4 v1, 0x2

    .line 351
    iput v1, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->label:I

    .line 352
    .line 353
    invoke-direct {v0, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getFavorites(Lt4/c;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    if-ne v1, v3, :cond_c

    .line 358
    .line 359
    goto/16 :goto_16

    .line 360
    .line 361
    :cond_c
    move v7, v12

    .line 362
    move v12, v13

    .line 363
    move-object v13, v8

    .line 364
    :goto_a
    check-cast v1, Ljava/util/List;

    .line 365
    .line 366
    move v6, v7

    .line 367
    move-object v8, v13

    .line 368
    :goto_b
    move v7, v11

    .line 369
    move-object v11, v1

    .line 370
    goto :goto_c

    .line 371
    :cond_d
    new-instance v1, Ljava/util/ArrayList;

    .line 372
    .line 373
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 374
    .line 375
    .line 376
    move v6, v12

    .line 377
    move v12, v13

    .line 378
    goto :goto_b

    .line 379
    :goto_c
    new-instance v9, Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-static {v8}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 386
    .line 387
    .line 388
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    if-eqz v5, :cond_11

    .line 397
    .line 398
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    check-cast v5, Ldev/jahir/frames/data/models/Wallpaper;

    .line 403
    .line 404
    if-eqz v11, :cond_f

    .line 405
    .line 406
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 407
    .line 408
    .line 409
    move-result v8

    .line 410
    if-eqz v8, :cond_f

    .line 411
    .line 412
    :cond_e
    const/4 v8, 0x0

    .line 413
    goto :goto_e

    .line 414
    :cond_f
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    :cond_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 419
    .line 420
    .line 421
    move-result v13

    .line 422
    if-eqz v13, :cond_e

    .line 423
    .line 424
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v13

    .line 428
    check-cast v13, Ldev/jahir/frames/data/models/Favorite;

    .line 429
    .line 430
    invoke-virtual {v13}, Ldev/jahir/frames/data/models/Favorite;->getUrl()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v13

    .line 434
    invoke-virtual {v5}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v15

    .line 438
    invoke-static {v13, v15}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v13

    .line 442
    if-eqz v13, :cond_10

    .line 443
    .line 444
    const/4 v8, 0x1

    .line 445
    :goto_e
    invoke-virtual {v5, v8}, Ldev/jahir/frames/data/models/Wallpaper;->setInFavorites(Z)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    goto :goto_d

    .line 452
    :cond_11
    if-eqz v12, :cond_15

    .line 453
    .line 454
    iput-object v10, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$0:Ljava/lang/Object;

    .line 455
    .line 456
    iput-object v14, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$1:Ljava/lang/Object;

    .line 457
    .line 458
    iput-object v10, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$2:Ljava/lang/Object;

    .line 459
    .line 460
    iput-object v11, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$3:Ljava/lang/Object;

    .line 461
    .line 462
    iput-object v9, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$4:Ljava/lang/Object;

    .line 463
    .line 464
    iput-boolean v12, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$0:Z

    .line 465
    .line 466
    iput-boolean v7, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$1:Z

    .line 467
    .line 468
    iput-boolean v6, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$2:Z

    .line 469
    .line 470
    iput-boolean v4, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$3:Z

    .line 471
    .line 472
    const/4 v1, 0x3

    .line 473
    iput v1, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->label:I

    .line 474
    .line 475
    invoke-direct {v0, v9, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->transformWallpapersToCollections(Ljava/util/List;Lt4/c;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    if-ne v1, v3, :cond_12

    .line 480
    .line 481
    goto/16 :goto_16

    .line 482
    .line 483
    :cond_12
    move v8, v12

    .line 484
    move-object v12, v14

    .line 485
    :goto_f
    check-cast v1, Ljava/util/List;

    .line 486
    .line 487
    invoke-virtual {v0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getCollections()Ljava/util/List;

    .line 488
    .line 489
    .line 490
    move-result-object v5

    .line 491
    invoke-direct {v0, v5, v1}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->areTheSameLists(Ljava/util/List;Ljava/util/List;)Z

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    if-eqz v5, :cond_13

    .line 496
    .line 497
    invoke-virtual {v0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getCollections()Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 502
    .line 503
    .line 504
    move-result v5

    .line 505
    if-nez v5, :cond_13

    .line 506
    .line 507
    if-eqz v6, :cond_14

    .line 508
    .line 509
    :cond_13
    invoke-direct {v0, v1}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->postCollections(Ljava/util/List;)V

    .line 510
    .line 511
    .line 512
    :cond_14
    move-object v14, v12

    .line 513
    move v12, v8

    .line 514
    :cond_15
    invoke-direct {v0, v14, v9}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->areTheSameLists(Ljava/util/List;Ljava/util/List;)Z

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    if-eqz v1, :cond_16

    .line 519
    .line 520
    invoke-virtual {v0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapers()Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    if-nez v5, :cond_16

    .line 529
    .line 530
    if-eqz v6, :cond_18

    .line 531
    .line 532
    :cond_16
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    if-eqz v5, :cond_17

    .line 537
    .line 538
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 539
    .line 540
    .line 541
    move-result v5

    .line 542
    if-eqz v5, :cond_17

    .line 543
    .line 544
    if-nez v4, :cond_18

    .line 545
    .line 546
    :cond_17
    invoke-direct {v0, v9}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->postWallpapers(Ljava/util/List;)V

    .line 547
    .line 548
    .line 549
    :cond_18
    if-eqz v7, :cond_1f

    .line 550
    .line 551
    new-instance v5, Ljava/util/ArrayList;

    .line 552
    .line 553
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 554
    .line 555
    .line 556
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v13

    .line 564
    if-eqz v13, :cond_1c

    .line 565
    .line 566
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v13

    .line 570
    move-object v14, v13

    .line 571
    check-cast v14, Ldev/jahir/frames/data/models/Wallpaper;

    .line 572
    .line 573
    if-eqz v11, :cond_1a

    .line 574
    .line 575
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 576
    .line 577
    .line 578
    move-result v15

    .line 579
    if-eqz v15, :cond_1a

    .line 580
    .line 581
    :cond_19
    move-object/from16 p1, v8

    .line 582
    .line 583
    goto :goto_12

    .line 584
    :cond_1a
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 585
    .line 586
    .line 587
    move-result-object v15

    .line 588
    :goto_11
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 589
    .line 590
    .line 591
    move-result v16

    .line 592
    if-eqz v16, :cond_19

    .line 593
    .line 594
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v16

    .line 598
    check-cast v16, Ldev/jahir/frames/data/models/Favorite;

    .line 599
    .line 600
    invoke-virtual/range {v16 .. v16}, Ldev/jahir/frames/data/models/Favorite;->getUrl()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v10

    .line 604
    move-object/from16 p1, v8

    .line 605
    .line 606
    invoke-virtual {v14}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    invoke-static {v10, v8}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v8

    .line 614
    if-eqz v8, :cond_1b

    .line 615
    .line 616
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    :goto_12
    move-object/from16 v8, p1

    .line 620
    .line 621
    const/4 v10, 0x0

    .line 622
    goto :goto_10

    .line 623
    :cond_1b
    move-object/from16 v8, p1

    .line 624
    .line 625
    const/4 v10, 0x0

    .line 626
    goto :goto_11

    .line 627
    :cond_1c
    invoke-direct {v0, v11, v5}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->areTheSameLists(Ljava/util/List;Ljava/util/List;)Z

    .line 628
    .line 629
    .line 630
    move-result v8

    .line 631
    if-eqz v8, :cond_1e

    .line 632
    .line 633
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 634
    .line 635
    .line 636
    move-result v8

    .line 637
    if-nez v8, :cond_1e

    .line 638
    .line 639
    if-eqz v6, :cond_1d

    .line 640
    .line 641
    goto :goto_14

    .line 642
    :cond_1d
    :goto_13
    const/4 v5, 0x0

    .line 643
    goto :goto_15

    .line 644
    :cond_1e
    :goto_14
    invoke-virtual {v0, v5}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->postFavorites(Ljava/util/List;)V

    .line 645
    .line 646
    .line 647
    goto :goto_13

    .line 648
    :cond_1f
    move-object v5, v10

    .line 649
    :goto_15
    iput-object v5, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$0:Ljava/lang/Object;

    .line 650
    .line 651
    iput-object v5, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$1:Ljava/lang/Object;

    .line 652
    .line 653
    iput-object v5, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$2:Ljava/lang/Object;

    .line 654
    .line 655
    iput-object v5, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$3:Ljava/lang/Object;

    .line 656
    .line 657
    iput-object v5, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->L$4:Ljava/lang/Object;

    .line 658
    .line 659
    iput-boolean v12, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$0:Z

    .line 660
    .line 661
    iput-boolean v7, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$1:Z

    .line 662
    .line 663
    iput-boolean v6, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$2:Z

    .line 664
    .line 665
    iput-boolean v4, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$3:Z

    .line 666
    .line 667
    iput-boolean v1, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->Z$4:Z

    .line 668
    .line 669
    const/4 v1, 0x4

    .line 670
    iput v1, v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$handleWallpapersData$1;->label:I

    .line 671
    .line 672
    invoke-direct {v0, v9, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->saveWallpapers(Ljava/util/List;Lt4/c;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    if-ne v1, v3, :cond_20

    .line 677
    .line 678
    :goto_16
    return-object v3

    .line 679
    :cond_20
    :goto_17
    new-instance v1, Ldev/jahir/frames/data/viewmodels/c;

    .line 680
    .line 681
    invoke-direct {v1, v0}, Ldev/jahir/frames/data/viewmodels/c;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;)V

    .line 682
    .line 683
    .line 684
    const-wide/16 v2, 0xa

    .line 685
    .line 686
    invoke-static {v2, v3, v1}, Ldev/jahir/frames/extensions/utils/GlobalKt;->postDelayed(JLd5/a;)V

    .line 687
    .line 688
    .line 689
    sget-object v1, Lp4/k;->a:Lp4/k;

    .line 690
    .line 691
    return-object v1
.end method

.method public static synthetic handleWallpapersData$default(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;ZZLjava/util/List;ZZLt4/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p8, :cond_5

    .line 2
    .line 3
    and-int/lit8 p8, p7, 0x1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p8, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 10
    .line 11
    if-eqz p8, :cond_1

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 15
    .line 16
    if-eqz p8, :cond_2

    .line 17
    .line 18
    sget-object p3, Lq4/r;->h:Lq4/r;

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz p8, :cond_3

    .line 24
    .line 25
    const/4 p4, 0x0

    .line 26
    :cond_3
    and-int/lit8 p7, p7, 0x10

    .line 27
    .line 28
    if-eqz p7, :cond_4

    .line 29
    .line 30
    const/4 p5, 0x0

    .line 31
    :cond_4
    invoke-direct/range {p0 .. p6}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->handleWallpapersData(ZZLjava/util/List;ZZLt4/c;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 37
    .line 38
    const-string p1, "Super calls with default arguments not supported in this target, function: handleWallpapersData"

    .line 39
    .line 40
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0
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
.end method

.method private static final handleWallpapersData$lambda$19(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;)Lp4/k;
    .locals 0

    .line 1
    iget-object p0, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->whenReady:Ld5/a;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 9
    .line 10
    return-object p0
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

.method public static internalAddToFavorites$suspendImpl(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            "Lt4/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object p2, Ldev/jahir/frames/data/db/FramesDatabase;->Companion:Ldev/jahir/frames/data/db/FramesDatabase$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p2, p0}, Ldev/jahir/frames/data/db/FramesDatabase$Companion;->getAppDatabase(Landroid/content/Context;)Ldev/jahir/frames/data/db/FramesDatabase;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ldev/jahir/frames/data/db/FramesDatabase;->favoritesDao()Ldev/jahir/frames/data/db/FavoritesDao;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    new-instance p2, Ldev/jahir/frames/data/models/Favorite;

    .line 20
    .line 21
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p2, p1}, Ldev/jahir/frames/data/models/Favorite;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p2}, Ldev/jahir/frames/data/db/FavoritesDao;->insert(Ldev/jahir/frames/data/models/Favorite;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    return-object p0
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

.method private final internalAddToLocalFavorites(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Ldev/jahir/frames/data/db/FramesDatabase;->Companion:Ldev/jahir/frames/data/db/FramesDatabase$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ldev/jahir/frames/data/db/FramesDatabase$Companion;->getAppDatabase(Landroid/content/Context;)Ldev/jahir/frames/data/db/FramesDatabase;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ldev/jahir/frames/data/db/FramesDatabase;->favoritesDao()Ldev/jahir/frames/data/db/FavoritesDao;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {p1}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ldev/jahir/frames/data/models/Wallpaper;

    .line 43
    .line 44
    new-instance v3, Ldev/jahir/frames/data/models/Favorite;

    .line 45
    .line 46
    invoke-virtual {v2}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-direct {v3, v2}, Ldev/jahir/frames/data/models/Favorite;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-interface {v0, v1}, Ldev/jahir/frames/data/db/FavoritesDao;->insertAll(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    const/4 p1, 0x1

    .line 61
    return p1
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

.method public static synthetic internalGetFavorites$suspendImpl(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;",
            "Lt4/c<",
            "-",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Favorite;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object p1, Ldev/jahir/frames/data/db/FramesDatabase;->Companion:Ldev/jahir/frames/data/db/FramesDatabase$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Ldev/jahir/frames/data/db/FramesDatabase$Companion;->getAppDatabase(Landroid/content/Context;)Ldev/jahir/frames/data/db/FramesDatabase;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ldev/jahir/frames/data/db/FramesDatabase;->favoritesDao()Ldev/jahir/frames/data/db/FavoritesDao;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ldev/jahir/frames/data/db/FavoritesDao;->getAllFavorites()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    :goto_0
    if-nez p0, :cond_1

    .line 26
    .line 27
    sget-object p0, Lq4/r;->h:Lq4/r;

    .line 28
    .line 29
    :cond_1
    return-object p0
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

.method private final internalNukeAllLocalFavorites()Z
    .locals 2

    .line 1
    sget-object v0, Ldev/jahir/frames/data/db/FramesDatabase;->Companion:Ldev/jahir/frames/data/db/FramesDatabase$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ldev/jahir/frames/data/db/FramesDatabase$Companion;->getAppDatabase(Landroid/content/Context;)Ldev/jahir/frames/data/db/FramesDatabase;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ldev/jahir/frames/data/db/FramesDatabase;->favoritesDao()Ldev/jahir/frames/data/db/FavoritesDao;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ldev/jahir/frames/data/db/FavoritesDao;->nuke()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    return v0
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

.method public static internalRemoveFromFavorites$suspendImpl(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            "Lt4/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object p2, Ldev/jahir/frames/data/db/FramesDatabase;->Companion:Ldev/jahir/frames/data/db/FramesDatabase$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p2, p0}, Ldev/jahir/frames/data/db/FramesDatabase$Companion;->getAppDatabase(Landroid/content/Context;)Ldev/jahir/frames/data/db/FramesDatabase;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ldev/jahir/frames/data/db/FramesDatabase;->favoritesDao()Ldev/jahir/frames/data/db/FavoritesDao;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    new-instance p2, Ldev/jahir/frames/data/models/Favorite;

    .line 20
    .line 21
    invoke-virtual {p1}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p2, p1}, Ldev/jahir/frames/data/models/Favorite;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p2}, Ldev/jahir/frames/data/db/FavoritesDao;->delete(Ldev/jahir/frames/data/models/Favorite;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    return-object p0
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

.method public static synthetic loadData$default(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;ZZZZILjava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p7, :cond_5

    .line 2
    .line 3
    and-int/lit8 p7, p6, 0x1

    .line 4
    .line 5
    if-eqz p7, :cond_0

    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eqz p7, :cond_1

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 16
    .line 17
    if-eqz p7, :cond_2

    .line 18
    .line 19
    const/4 p3, 0x1

    .line 20
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 21
    .line 22
    if-eqz p7, :cond_3

    .line 23
    .line 24
    const/4 p4, 0x0

    .line 25
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 26
    .line 27
    if-eqz p6, :cond_4

    .line 28
    .line 29
    const/4 p7, 0x1

    .line 30
    move p5, p3

    .line 31
    move p6, p4

    .line 32
    move-object p3, p1

    .line 33
    move p4, p2

    .line 34
    move-object p2, p0

    .line 35
    goto :goto_0

    .line 36
    :cond_4
    move p7, p5

    .line 37
    move p6, p4

    .line 38
    move p4, p2

    .line 39
    move p5, p3

    .line 40
    move-object p2, p0

    .line 41
    move-object p3, p1

    .line 42
    :goto_0
    invoke-virtual/range {p2 .. p7}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->loadData(Ljava/lang/String;ZZZZ)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 47
    .line 48
    const-string p1, "Super calls with default arguments not supported in this target, function: loadData"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0
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
.end method

.method private final loadRemoteData(Ljava/lang/String;ZZZZLt4/c;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZZZ",
            "Lt4/c<",
            "-",
            "Lp4/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p6

    .line 14
    .line 15
    instance-of v7, v6, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;

    .line 16
    .line 17
    if-eqz v7, :cond_0

    .line 18
    .line 19
    move-object v7, v6

    .line 20
    check-cast v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;

    .line 21
    .line 22
    iget v8, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->label:I

    .line 23
    .line 24
    const/high16 v9, -0x80000000

    .line 25
    .line 26
    and-int v10, v8, v9

    .line 27
    .line 28
    if-eqz v10, :cond_0

    .line 29
    .line 30
    sub-int/2addr v8, v9

    .line 31
    iput v8, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->label:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;

    .line 35
    .line 36
    invoke-direct {v7, v1, v6}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v6, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->result:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v10, Lu4/a;->h:Lu4/a;

    .line 42
    .line 43
    iget v8, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->label:I

    .line 44
    .line 45
    const/4 v9, 0x3

    .line 46
    const/4 v11, 0x1

    .line 47
    sget-object v12, Lp4/k;->a:Lp4/k;

    .line 48
    .line 49
    const/4 v13, 0x2

    .line 50
    const/4 v14, 0x0

    .line 51
    if-eqz v8, :cond_4

    .line 52
    .line 53
    if-eq v8, v11, :cond_3

    .line 54
    .line 55
    if-eq v8, v13, :cond_2

    .line 56
    .line 57
    if-ne v8, v9, :cond_1

    .line 58
    .line 59
    iget-boolean v2, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$3:Z

    .line 60
    .line 61
    iget-object v0, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->L$1:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/util/List;

    .line 64
    .line 65
    iget-object v0, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    :try_start_0
    invoke-static {v6}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    return-object v12

    .line 73
    :catch_0
    move-exception v0

    .line 74
    move v5, v2

    .line 75
    goto/16 :goto_9

    .line 76
    .line 77
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_2
    iget-boolean v0, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$4:Z

    .line 86
    .line 87
    iget-boolean v2, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$3:Z

    .line 88
    .line 89
    iget-boolean v3, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$2:Z

    .line 90
    .line 91
    iget-boolean v4, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$1:Z

    .line 92
    .line 93
    iget-boolean v5, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$0:Z

    .line 94
    .line 95
    iget-object v8, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->L$0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v8, Ljava/lang/String;

    .line 98
    .line 99
    :try_start_1
    invoke-static {v6}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    .line 101
    .line 102
    move/from16 v16, v5

    .line 103
    .line 104
    move v5, v2

    .line 105
    move/from16 v2, v16

    .line 106
    .line 107
    move/from16 v16, v4

    .line 108
    .line 109
    move v4, v3

    .line 110
    move/from16 v3, v16

    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_3
    iget-object v0, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->L$0:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v6}, Le6/l;->H(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-object v12

    .line 122
    :cond_4
    invoke-static {v6}, Le6/l;->H(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-nez v6, :cond_5

    .line 130
    .line 131
    goto/16 :goto_a

    .line 132
    .line 133
    :cond_5
    const-string v6, "file://"

    .line 134
    .line 135
    const/4 v8, 0x0

    .line 136
    invoke-static {v0, v6, v8}, Ll5/m;->j0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-nez v6, :cond_8

    .line 141
    .line 142
    invoke-virtual {v1}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    invoke-static {v15}, Ldev/jahir/frames/extensions/context/ContextKt;->isNetworkAvailable(Landroid/content/Context;)Z

    .line 147
    .line 148
    .line 149
    move-result v15

    .line 150
    if-nez v15, :cond_8

    .line 151
    .line 152
    if-eqz v5, :cond_6

    .line 153
    .line 154
    iget-object v0, v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->errorListener:Ld5/l;

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    sget-object v8, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$DataError;->NoNetwork:Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$DataError;

    .line 159
    .line 160
    invoke-interface {v0, v8}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :cond_6
    iput-object v14, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->L$0:Ljava/lang/Object;

    .line 164
    .line 165
    iput-boolean v2, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$0:Z

    .line 166
    .line 167
    iput-boolean v3, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$1:Z

    .line 168
    .line 169
    iput-boolean v4, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$2:Z

    .line 170
    .line 171
    iput-boolean v5, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$3:Z

    .line 172
    .line 173
    iput-boolean v6, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$4:Z

    .line 174
    .line 175
    iput v11, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->label:I

    .line 176
    .line 177
    const/4 v2, 0x0

    .line 178
    const/4 v3, 0x0

    .line 179
    const/4 v4, 0x0

    .line 180
    const/4 v5, 0x0

    .line 181
    const/4 v6, 0x0

    .line 182
    const/16 v8, 0x1f

    .line 183
    .line 184
    const/4 v9, 0x0

    .line 185
    invoke-static/range {v1 .. v9}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->handleWallpapersData$default(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;ZZLjava/util/List;ZZLt4/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-ne v0, v10, :cond_7

    .line 190
    .line 191
    :goto_1
    move-object/from16 v1, p0

    .line 192
    .line 193
    goto/16 :goto_7

    .line 194
    .line 195
    :cond_7
    move-object/from16 v1, p0

    .line 196
    .line 197
    goto/16 :goto_a

    .line 198
    .line 199
    :cond_8
    if-eqz v6, :cond_b

    .line 200
    .line 201
    :try_start_2
    invoke-virtual/range {p0 .. p0}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-eqz v1, :cond_a

    .line 210
    .line 211
    const-string v11, "file:///android_asset/"

    .line 212
    .line 213
    const-string v13, ""

    .line 214
    .line 215
    invoke-static {v0, v11, v13, v8}, Ll5/m;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v1, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-eqz v0, :cond_a

    .line 224
    .line 225
    sget-object v1, Ll5/a;->a:Ljava/nio/charset/Charset;

    .line 226
    .line 227
    new-instance v11, Ljava/io/InputStreamReader;

    .line 228
    .line 229
    invoke-direct {v11, v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 230
    .line 231
    .line 232
    const/16 v0, 0x2000

    .line 233
    .line 234
    new-instance v1, Ljava/io/BufferedReader;

    .line 235
    .line 236
    invoke-direct {v1, v11, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 237
    .line 238
    .line 239
    new-instance v11, Ljava/io/StringWriter;

    .line 240
    .line 241
    invoke-direct {v11}, Ljava/io/StringWriter;-><init>()V

    .line 242
    .line 243
    .line 244
    new-array v0, v0, [C

    .line 245
    .line 246
    invoke-virtual {v1, v0}, Ljava/io/Reader;->read([C)I

    .line 247
    .line 248
    .line 249
    move-result v13

    .line 250
    :goto_2
    if-ltz v13, :cond_9

    .line 251
    .line 252
    invoke-virtual {v11, v0, v8, v13}, Ljava/io/Writer;->write([CII)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v0}, Ljava/io/Reader;->read([C)I

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    goto :goto_2

    .line 260
    :cond_9
    invoke-virtual {v11}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    const-string v1, "toString(...)"

    .line 265
    .line 266
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :goto_3
    move-object/from16 v1, p0

    .line 271
    .line 272
    goto/16 :goto_9

    .line 273
    .line 274
    :catch_1
    move-exception v0

    .line 275
    goto :goto_3

    .line 276
    :cond_a
    move-object v0, v14

    .line 277
    :goto_4
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$listType$1;

    .line 278
    .line 279
    invoke-direct {v1}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$listType$1;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    const-string v8, "getType(...)"

    .line 287
    .line 288
    invoke-static {v1, v8}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    new-instance v8, Lcom/google/gson/Gson;

    .line 292
    .line 293
    invoke-direct {v8}, Lcom/google/gson/Gson;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v8, v0, v1}, Lcom/google/gson/Gson;->b(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    const-string v1, "fromJson(...)"

    .line 305
    .line 306
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    check-cast v0, Ljava/util/List;

    .line 310
    .line 311
    move v11, v5

    .line 312
    move v5, v4

    .line 313
    move-object v4, v0

    .line 314
    goto :goto_6

    .line 315
    :cond_b
    invoke-direct/range {p0 .. p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getService()Ldev/jahir/frames/data/network/WallpapersJSONService;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    iput-object v14, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->L$0:Ljava/lang/Object;

    .line 320
    .line 321
    iput-boolean v2, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$0:Z

    .line 322
    .line 323
    iput-boolean v3, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$1:Z

    .line 324
    .line 325
    iput-boolean v4, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$2:Z

    .line 326
    .line 327
    iput-boolean v5, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$3:Z

    .line 328
    .line 329
    iput-boolean v6, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$4:Z

    .line 330
    .line 331
    iput v13, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->label:I

    .line 332
    .line 333
    invoke-interface {v1, v0, v7}, Ldev/jahir/frames/data/network/WallpapersJSONService;->getJSON(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-ne v0, v10, :cond_c

    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :cond_c
    move/from16 v16, v6

    .line 342
    .line 343
    move-object v6, v0

    .line 344
    move/from16 v0, v16

    .line 345
    .line 346
    :goto_5
    move-object v1, v6

    .line 347
    check-cast v1, Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 348
    .line 349
    move v6, v0

    .line 350
    move v11, v5

    .line 351
    move v5, v4

    .line 352
    move-object v4, v1

    .line 353
    :goto_6
    :try_start_3
    iput-object v14, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->L$0:Ljava/lang/Object;

    .line 354
    .line 355
    iput-object v14, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->L$1:Ljava/lang/Object;

    .line 356
    .line 357
    iput-boolean v2, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$0:Z

    .line 358
    .line 359
    iput-boolean v3, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$1:Z

    .line 360
    .line 361
    iput-boolean v5, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$2:Z

    .line 362
    .line 363
    iput-boolean v11, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$3:Z

    .line 364
    .line 365
    iput-boolean v6, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->Z$4:Z

    .line 366
    .line 367
    iput v9, v7, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadRemoteData$1;->label:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 368
    .line 369
    const/4 v6, 0x0

    .line 370
    const/16 v8, 0x10

    .line 371
    .line 372
    const/4 v9, 0x0

    .line 373
    move-object/from16 v1, p0

    .line 374
    .line 375
    :try_start_4
    invoke-static/range {v1 .. v9}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->handleWallpapersData$default(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;ZZLjava/util/List;ZZLt4/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 379
    if-ne v0, v10, :cond_d

    .line 380
    .line 381
    :goto_7
    return-object v10

    .line 382
    :catch_2
    move-exception v0

    .line 383
    :goto_8
    move v5, v11

    .line 384
    goto :goto_9

    .line 385
    :catch_3
    move-exception v0

    .line 386
    move-object/from16 v1, p0

    .line 387
    .line 388
    goto :goto_8

    .line 389
    :goto_9
    if-eqz v5, :cond_d

    .line 390
    .line 391
    instance-of v0, v0, Lcom/google/gson/stream/MalformedJsonException;

    .line 392
    .line 393
    if-eqz v0, :cond_d

    .line 394
    .line 395
    iget-object v0, v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->errorListener:Ld5/l;

    .line 396
    .line 397
    if-eqz v0, :cond_d

    .line 398
    .line 399
    sget-object v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$DataError;->MalformedJson:Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$DataError;

    .line 400
    .line 401
    invoke-interface {v0, v2}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    :cond_d
    :goto_a
    return-object v12
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
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method public static synthetic loadRemoteData$default(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;ZZZZLt4/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p8, :cond_5

    .line 2
    .line 3
    and-int/lit8 p8, p7, 0x1

    .line 4
    .line 5
    if-eqz p8, :cond_0

    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eqz p8, :cond_1

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 16
    .line 17
    if-eqz p8, :cond_2

    .line 18
    .line 19
    const/4 p3, 0x1

    .line 20
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 21
    .line 22
    if-eqz p8, :cond_3

    .line 23
    .line 24
    const/4 p4, 0x0

    .line 25
    :cond_3
    and-int/lit8 p7, p7, 0x10

    .line 26
    .line 27
    if-eqz p7, :cond_4

    .line 28
    .line 29
    const/4 p7, 0x1

    .line 30
    move p5, p3

    .line 31
    move-object p8, p6

    .line 32
    move-object p3, p1

    .line 33
    move p6, p4

    .line 34
    :goto_0
    move p4, p2

    .line 35
    move-object p2, p0

    .line 36
    goto :goto_1

    .line 37
    :cond_4
    move p7, p5

    .line 38
    move-object p8, p6

    .line 39
    move p5, p3

    .line 40
    move p6, p4

    .line 41
    move-object p3, p1

    .line 42
    goto :goto_0

    .line 43
    :goto_1
    invoke-direct/range {p2 .. p8}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->loadRemoteData(Ljava/lang/String;ZZZZLt4/c;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 49
    .line 50
    const-string p1, "Super calls with default arguments not supported in this target, function: loadRemoteData"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0
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
.end method

.method private final postCollections(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ldev/jahir/frames/data/models/Collection;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getCollectionsData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f0;->l(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getCollectionsData()Landroidx/lifecycle/i0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
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

.method private final postWallpapers(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapersData()Landroidx/lifecycle/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f0;->l(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapersData()Landroidx/lifecycle/i0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
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

.method private final safeAddToFavorites(Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            "Lt4/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$safeAddToFavorites$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$safeAddToFavorites$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private final safeRemoveFromFavorites(Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            "Lt4/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$safeRemoveFromFavorites$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$safeRemoveFromFavorites$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private final saveWallpapers(Ljava/util/List;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;",
            "Lt4/c<",
            "-",
            "Lp4/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$saveWallpapers$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$saveWallpapers$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/util/List;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method private static final service_delegate$lambda$0()Ldev/jahir/frames/data/network/WallpapersJSONService;
    .locals 4

    .line 1
    new-instance v0, La1/w;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, La1/w;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "http://localhost/"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, La1/w;->m(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ll6/c;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-direct {v1, v2}, Ll6/c;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, La1/w;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    new-instance v1, Lcom/google/gson/GsonBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/gson/GsonBuilder;->a()Lcom/google/gson/Gson;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v3, Lm6/a;

    .line 36
    .line 37
    invoke-direct {v3, v1}, Lm6/a;-><init>(Lcom/google/gson/Gson;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La1/w;->n()Landroidx/lifecycle/a1;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-class v1, Ldev/jahir/frames/data/network/WallpapersJSONService;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroidx/lifecycle/a1;->g(Ljava/lang/Class;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ldev/jahir/frames/data/network/WallpapersJSONService;

    .line 54
    .line 55
    return-object v0
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

.method private final transformWallpapersToCollections(Ljava/util/List;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;",
            "Lt4/c<",
            "-",
            "Ljava/util/List<",
            "+",
            "Ldev/jahir/frames/data/models/Collection;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$transformWallpapersToCollections$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$transformWallpapersToCollections$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/util/List;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.method public final addAllToLocalFavorites(Ljava/util/List;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;",
            "Lt4/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$addAllToLocalFavorites$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$addAllToLocalFavorites$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/util/List;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final addToFavorites(Ldev/jahir/frames/data/models/Wallpaper;)Z
    .locals 4

    .line 1
    const-string v0, "wallpaper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/jvm/internal/m;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/t0;->g(Landroidx/lifecycle/z0;)Lk1/a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$addToFavorites$1;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v0, p0, p1, v3}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$addToFavorites$1;-><init>(Lkotlin/jvm/internal/m;Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    invoke-static {v1, v3, v3, v2, p1}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 23
    .line 24
    .line 25
    iget-boolean p1, v0, Lkotlin/jvm/internal/m;->h:Z

    .line 26
    .line 27
    return p1
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

.method public final destroy(Landroidx/lifecycle/w;)V
    .locals 1

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapersData()Landroidx/lifecycle/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->k(Landroidx/lifecycle/w;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getCollectionsData()Landroidx/lifecycle/i0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->k(Landroidx/lifecycle/w;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getFavoritesData()Landroidx/lifecycle/i0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->k(Landroidx/lifecycle/w;)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public final findWallpaper(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$findWallpaper$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$findWallpaper$2;-><init>(Ljava/lang/String;Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final getCollections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Collection;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getCollectionsData()Landroidx/lifecycle/i0;

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

.method public final getErrorListener$library_release()Ld5/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld5/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->errorListener:Ld5/l;

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

.method public final getFavorites()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getFavoritesData()Landroidx/lifecycle/i0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/f0;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, Lq4/r;->h:Lq4/r;

    :cond_0
    return-object v0
.end method

.method public final getNextFavoriteWallpaper(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getNextFavoriteWallpaper$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getNextFavoriteWallpaper$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final getNextWallpaper(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getNextWallpaper$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p2, p1, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getNextWallpaper$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Ljava/lang/String;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final getPreviousFavoriteWallpaper(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getPreviousFavoriteWallpaper$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getPreviousFavoriteWallpaper$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final getPreviousWallpaper(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getPreviousWallpaper$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p2, p1, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$getPreviousWallpaper$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ljava/lang/String;Ljava/lang/String;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final getWallpapers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapersData()Landroidx/lifecycle/i0;

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

.method public final getWhenReady$library_release()Ld5/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld5/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->whenReady:Ld5/a;

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

.method public internalAddToFavorites(Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            "Lt4/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->internalAddToFavorites$suspendImpl(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public internalGetFavorites(Lt4/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Favorite;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->internalGetFavorites$suspendImpl(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public internalRemoveFromFavorites(Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            "Lt4/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->internalRemoveFromFavorites$suspendImpl(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public internalTransformWallpapersToCollections(Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Collection;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "wallpapers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_5

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ldev/jahir/frames/data/models/Wallpaper;

    .line 27
    .line 28
    invoke-virtual {v1}, Ldev/jahir/frames/data/models/Wallpaper;->getCollections()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    const-string v3, ""

    .line 35
    .line 36
    :cond_1
    const-string v4, "|"

    .line 37
    .line 38
    const-string v5, ","

    .line 39
    .line 40
    invoke-static {v3, v4, v5, v2}, Ll5/m;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    filled-new-array {v5}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v2, v3}, Ll5/e;->B0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v3, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-static {v2}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v4}, Ll5/e;->I0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    invoke-static {v3}, Lq4/i;->o0(Ljava/util/List;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_0

    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    check-cast v3, Ljava/lang/String;

    .line 108
    .line 109
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 110
    .line 111
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const-string v5, "toLowerCase(...)"

    .line 116
    .line 117
    invoke-static {v4, v5}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    check-cast v5, Lp4/f;

    .line 125
    .line 126
    if-eqz v5, :cond_3

    .line 127
    .line 128
    iget-object v5, v5, Lp4/f;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v5, Ljava/util/List;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    const/4 v5, 0x0

    .line 134
    :goto_2
    if-nez v5, :cond_4

    .line 135
    .line 136
    sget-object v5, Lq4/r;->h:Lq4/r;

    .line 137
    .line 138
    :cond_4
    new-instance v6, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    new-instance v5, Lp4/f;

    .line 147
    .line 148
    invoke-direct {v5, v3, v6}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    const-string p1, "wallpaper of the day"

    .line 156
    .line 157
    const-string v1, "wallpaper of the week"

    .line 158
    .line 159
    const-string v3, "all"

    .line 160
    .line 161
    const-string v4, "featured"

    .line 162
    .line 163
    const-string v5, "new"

    .line 164
    .line 165
    filled-new-array {v3, v4, v5, p1, v1}, [Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    new-instance v1, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    const/4 v3, 0x0

    .line 175
    :goto_3
    const/4 v4, 0x5

    .line 176
    if-ge v3, v4, :cond_6

    .line 177
    .line 178
    aget-object v4, p1, v3

    .line 179
    .line 180
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    add-int/lit8 v3, v3, 0x1

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_7

    .line 215
    .line 216
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    check-cast v3, Ljava/util/Map$Entry;

    .line 221
    .line 222
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    check-cast v3, Lp4/f;

    .line 227
    .line 228
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_7
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 233
    .line 234
    .line 235
    new-instance p1, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 238
    .line 239
    .line 240
    new-instance v0, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    const/4 v4, 0x0

    .line 250
    :cond_8
    :goto_5
    if-ge v4, v3, :cond_9

    .line 251
    .line 252
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    add-int/lit8 v4, v4, 0x1

    .line 257
    .line 258
    if-eqz v5, :cond_8

    .line 259
    .line 260
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    const/4 v4, 0x0

    .line 274
    :cond_a
    :goto_6
    if-ge v4, v3, :cond_b

    .line 275
    .line 276
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    add-int/lit8 v4, v4, 0x1

    .line 281
    .line 282
    move-object v6, v5

    .line 283
    check-cast v6, Lp4/f;

    .line 284
    .line 285
    iget-object v6, v6, Lp4/f;->i:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v6, Ljava/util/Collection;

    .line 288
    .line 289
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    if-nez v6, :cond_a

    .line 294
    .line 295
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-static {v1}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    :goto_7
    if-ge v2, v3, :cond_e

    .line 313
    .line 314
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    add-int/lit8 v2, v2, 0x1

    .line 319
    .line 320
    check-cast v4, Lp4/f;

    .line 321
    .line 322
    iget-object v5, v4, Lp4/f;->h:Ljava/lang/Object;

    .line 323
    .line 324
    move-object v7, v5

    .line 325
    check-cast v7, Ljava/lang/String;

    .line 326
    .line 327
    iget-object v4, v4, Lp4/f;->i:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v4, Ljava/lang/Iterable;

    .line 330
    .line 331
    new-instance v5, Ljava/util/HashSet;

    .line 332
    .line 333
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 334
    .line 335
    .line 336
    new-instance v9, Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 339
    .line 340
    .line 341
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    :cond_c
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    if-eqz v6, :cond_d

    .line 350
    .line 351
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    move-object v8, v6

    .line 356
    check-cast v8, Ldev/jahir/frames/data/models/Wallpaper;

    .line 357
    .line 358
    invoke-virtual {v8}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    if-eqz v8, :cond_c

    .line 367
    .line 368
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_d
    new-instance v6, Ldev/jahir/frames/data/models/Collection;

    .line 373
    .line 374
    const/4 v8, 0x0

    .line 375
    const/4 v10, 0x2

    .line 376
    const/4 v11, 0x0

    .line 377
    invoke-direct/range {v6 .. v11}, Ldev/jahir/frames/data/models/Collection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/e;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v6, p1}, Ldev/jahir/frames/data/models/Collection;->setupCover(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    goto :goto_7

    .line 388
    :cond_e
    return-object v0
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
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final loadData(Ljava/lang/String;ZZZZ)V
    .locals 9

    .line 1
    const-string v0, "url"

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
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadData$1;

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    move-object v2, p0

    .line 14
    move-object v6, p1

    .line 15
    move v3, p2

    .line 16
    move v4, p3

    .line 17
    move v5, p4

    .line 18
    move v7, p5

    .line 19
    invoke-direct/range {v1 .. v8}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$loadData$1;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;ZZZLjava/lang/String;ZLt4/c;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x3

    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-static {v0, p2, p2, v1, p1}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 25
    .line 26
    .line 27
    return-void
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

.method public final nukeLocalFavorites(Lt4/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/g0;->a:Lu5/e;

    .line 2
    .line 3
    sget-object v0, Lu5/d;->i:Lu5/d;

    .line 4
    .line 5
    new-instance v1, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$nukeLocalFavorites$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$nukeLocalFavorites$2;-><init>(Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Lt4/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final observeCollections(Landroidx/lifecycle/w;Ld5/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/w;",
            "Ld5/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onUpdated"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getCollectionsData()Landroidx/lifecycle/i0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ldev/jahir/frames/extensions/utils/LiveDataKt$tryToObserve$1;

    .line 16
    .line 17
    invoke-direct {v1, p2}, Ldev/jahir/frames/extensions/utils/LiveDataKt$tryToObserve$1;-><init>(Ld5/l;)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;

    .line 21
    .line 22
    invoke-direct {p2, v1}, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;-><init>(Ld5/l;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/f0;->e(Landroidx/lifecycle/w;Landroidx/lifecycle/j0;)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public final observeFavorites(Landroidx/lifecycle/w;Ld5/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/w;",
            "Ld5/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onUpdated"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getFavoritesData()Landroidx/lifecycle/i0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ldev/jahir/frames/extensions/utils/LiveDataKt$tryToObserve$1;

    .line 16
    .line 17
    invoke-direct {v1, p2}, Ldev/jahir/frames/extensions/utils/LiveDataKt$tryToObserve$1;-><init>(Ld5/l;)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;

    .line 21
    .line 22
    invoke-direct {p2, v1}, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;-><init>(Ld5/l;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/f0;->e(Landroidx/lifecycle/w;Landroidx/lifecycle/j0;)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public final observeWallpapers(Landroidx/lifecycle/w;Ld5/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/w;",
            "Ld5/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onUpdated"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getWallpapersData()Landroidx/lifecycle/i0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ldev/jahir/frames/extensions/utils/LiveDataKt$tryToObserve$1;

    .line 16
    .line 17
    invoke-direct {v1, p2}, Ldev/jahir/frames/extensions/utils/LiveDataKt$tryToObserve$1;-><init>(Ld5/l;)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;

    .line 21
    .line 22
    invoke-direct {p2, v1}, Ldev/jahir/frames/extensions/utils/LiveDataKt$sam$i$androidx_lifecycle_Observer$0;-><init>(Ld5/l;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/f0;->e(Landroidx/lifecycle/w;Landroidx/lifecycle/j0;)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public final postFavorites(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getFavoritesData()Landroidx/lifecycle/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f0;->l(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->getFavoritesData()Landroidx/lifecycle/i0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
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

.method public final removeFromFavorites(Ldev/jahir/frames/data/models/Wallpaper;)Z
    .locals 4

    .line 1
    const-string v0, "wallpaper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/jvm/internal/m;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/t0;->g(Landroidx/lifecycle/z0;)Lk1/a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$removeFromFavorites$1;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v0, p0, p1, v3}, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel$removeFromFavorites$1;-><init>(Lkotlin/jvm/internal/m;Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;Ldev/jahir/frames/data/models/Wallpaper;Lt4/c;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    invoke-static {v1, v3, v3, v2, p1}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 23
    .line 24
    .line 25
    iget-boolean p1, v0, Lkotlin/jvm/internal/m;->h:Z

    .line 26
    .line 27
    return p1
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

.method public final setErrorListener$library_release(Ld5/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->errorListener:Ld5/l;

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

.method public final setWhenReady$library_release(Ld5/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldev/jahir/frames/data/viewmodels/WallpapersDataViewModel;->whenReady:Ld5/a;

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
