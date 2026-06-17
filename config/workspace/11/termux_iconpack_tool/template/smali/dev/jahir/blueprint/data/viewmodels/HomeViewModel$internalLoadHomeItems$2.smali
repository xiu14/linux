.class final Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;
.super Lv4/h;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;->internalLoadHomeItems(Lt4/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv4/h;",
        "Ld5/p;"
    }
.end annotation

.annotation runtime Lv4/e;
    c = "dev.jahir.blueprint.data.viewmodels.HomeViewModel$internalLoadHomeItems$2"
    f = "HomeViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;


# direct methods
.method public constructor <init>(Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;Lt4/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->this$0:Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lv4/h;-><init>(ILt4/c;)V

    .line 5
    .line 6
    .line 7
    return-void
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


# virtual methods
.method public final create(Ljava/lang/Object;Lt4/c;)Lt4/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lt4/c<",
            "*>;)",
            "Lt4/c<",
            "Lp4/k;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;

    .line 2
    .line 3
    iget-object v0, p0, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->this$0:Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;-><init>(Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;Lt4/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln5/v;

    check-cast p2, Lt4/c;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->invoke(Ln5/v;Lt4/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln5/v;Lt4/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln5/v;",
            "Lt4/c<",
            "-",
            "Ljava/util/ArrayList<",
            "Ldev/jahir/blueprint/data/models/HomeItem;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    move-result-object p1

    check-cast p1, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;

    sget-object p2, Lp4/k;->a:Lp4/k;

    invoke-virtual {p1, p2}, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 4
    .line 5
    iget v1, v0, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->label:I

    .line 6
    .line 7
    if-nez v1, :cond_15

    .line 8
    .line 9
    invoke-static/range {p1 .. p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->this$0:Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget v3, Ldev/jahir/blueprint/R$array;->home_list_titles:I

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-static {v2, v3, v4, v5, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-instance v3, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    array-length v6, v2

    .line 37
    const/4 v8, 0x0

    .line 38
    :goto_0
    if-ge v8, v6, :cond_1

    .line 39
    .line 40
    aget-object v9, v2, v8

    .line 41
    .line 42
    invoke-static {v9}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    if-eqz v10, :cond_0

    .line 47
    .line 48
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object v2, v0, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->this$0:Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget v6, Ldev/jahir/blueprint/R$array;->home_list_descriptions:I

    .line 61
    .line 62
    invoke-static {v2, v6, v4, v5, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v6, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    array-length v8, v2

    .line 72
    const/4 v9, 0x0

    .line 73
    :goto_1
    if-ge v9, v8, :cond_3

    .line 74
    .line 75
    aget-object v10, v2, v9

    .line 76
    .line 77
    invoke-static {v10}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-eqz v11, :cond_2

    .line 82
    .line 83
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    iget-object v2, v0, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->this$0:Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 90
    .line 91
    invoke-virtual {v2}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    sget v8, Ldev/jahir/blueprint/R$array;->home_list_icons:I

    .line 96
    .line 97
    invoke-static {v2, v8, v4, v5, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v8, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    array-length v9, v2

    .line 107
    const/4 v10, 0x0

    .line 108
    :goto_2
    if-ge v10, v9, :cond_5

    .line 109
    .line 110
    aget-object v11, v2, v10

    .line 111
    .line 112
    invoke-static {v11}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-eqz v12, :cond_4

    .line 117
    .line 118
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    iget-object v2, v0, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->this$0:Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 125
    .line 126
    invoke-virtual {v2}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    sget v9, Ldev/jahir/blueprint/R$array;->home_list_links:I

    .line 131
    .line 132
    invoke-static {v2, v9, v4, v5, v4}, Ldev/jahir/frames/extensions/context/ContextKt;->stringArray$default(Landroid/content/Context;I[Ljava/lang/String;ILjava/lang/Object;)[Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    new-instance v5, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    array-length v9, v2

    .line 142
    const/4 v10, 0x0

    .line 143
    :goto_3
    if-ge v10, v9, :cond_7

    .line 144
    .line 145
    aget-object v11, v2, v10

    .line 146
    .line 147
    invoke-static {v11}, Ldev/jahir/frames/extensions/resources/StringKt;->hasContent(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    if-eqz v12, :cond_6

    .line 152
    .line 153
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    if-ne v2, v9, :cond_13

    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    if-ne v2, v9, :cond_13

    .line 178
    .line 179
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-ne v2, v9, :cond_13

    .line 188
    .line 189
    new-instance v2, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-static {v3}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v12, 0x0

    .line 204
    :goto_4
    if-ge v12, v9, :cond_9

    .line 205
    .line 206
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    add-int/lit8 v12, v12, 0x1

    .line 211
    .line 212
    add-int/lit8 v14, v11, 0x1

    .line 213
    .line 214
    if-ltz v11, :cond_8

    .line 215
    .line 216
    check-cast v13, Ljava/lang/String;

    .line 217
    .line 218
    new-instance v15, Ldev/jahir/blueprint/data/models/DefHomeItem;

    .line 219
    .line 220
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v16

    .line 224
    move-object/from16 v10, v16

    .line 225
    .line 226
    check-cast v10, Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v16

    .line 232
    move-object/from16 v7, v16

    .line 233
    .line 234
    check-cast v7, Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    check-cast v11, Ljava/lang/String;

    .line 241
    .line 242
    invoke-direct {v15, v13, v10, v7, v11}, Ldev/jahir/blueprint/data/models/DefHomeItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move v11, v14

    .line 249
    goto :goto_4

    .line 250
    :cond_8
    invoke-static {}, Lq4/j;->i0()V

    .line 251
    .line 252
    .line 253
    throw v4

    .line 254
    :cond_9
    new-instance v3, Ljava/util/HashSet;

    .line 255
    .line 256
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 257
    .line 258
    .line 259
    new-instance v5, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    const/4 v7, 0x0

    .line 269
    :cond_a
    :goto_5
    if-ge v7, v6, :cond_b

    .line 270
    .line 271
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    add-int/lit8 v7, v7, 0x1

    .line 276
    .line 277
    move-object v9, v8

    .line 278
    check-cast v9, Ldev/jahir/blueprint/data/models/DefHomeItem;

    .line 279
    .line 280
    invoke-virtual {v9}, Ldev/jahir/blueprint/data/models/DefHomeItem;->getUrl()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    invoke-virtual {v3, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    if-eqz v9, :cond_a

    .line 289
    .line 290
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :cond_b
    iget-object v2, v0, Ldev/jahir/blueprint/data/viewmodels/HomeViewModel$internalLoadHomeItems$2;->this$0:Ldev/jahir/blueprint/data/viewmodels/HomeViewModel;

    .line 295
    .line 296
    new-instance v3, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-static {v5}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    const/4 v7, 0x0

    .line 310
    :goto_6
    if-ge v7, v6, :cond_12

    .line 311
    .line 312
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    add-int/lit8 v7, v7, 0x1

    .line 317
    .line 318
    check-cast v8, Ldev/jahir/blueprint/data/models/DefHomeItem;

    .line 319
    .line 320
    invoke-virtual {v8}, Ldev/jahir/blueprint/data/models/DefHomeItem;->getUrl()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    const/4 v10, 0x1

    .line 325
    invoke-static {v9, v4, v10, v4}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    const-string v11, "market://details?id="

    .line 330
    .line 331
    const/4 v12, 0x0

    .line 332
    invoke-static {v9, v11, v12}, Ll5/m;->j0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    if-nez v9, :cond_d

    .line 337
    .line 338
    invoke-virtual {v8}, Ldev/jahir/blueprint/data/models/DefHomeItem;->getUrl()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v13

    .line 342
    invoke-static {v13, v4, v10, v4}, Ldev/jahir/frames/extensions/resources/StringKt;->lower$default(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v13

    .line 346
    const-string v14, "https://play.google.com/store/apps/details?id="

    .line 347
    .line 348
    invoke-static {v13, v14, v12}, Ll5/m;->j0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 349
    .line 350
    .line 351
    move-result v13

    .line 352
    if-eqz v13, :cond_c

    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_c
    const/16 v23, 0x0

    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_d
    :goto_7
    const/16 v23, 0x1

    .line 359
    .line 360
    :goto_8
    if-eqz v23, :cond_f

    .line 361
    .line 362
    invoke-virtual {v8}, Ldev/jahir/blueprint/data/models/DefHomeItem;->getUrl()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v12

    .line 366
    invoke-virtual {v8}, Ldev/jahir/blueprint/data/models/DefHomeItem;->getUrl()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v13

    .line 370
    const-string v14, "="

    .line 371
    .line 372
    const/4 v15, 0x6

    .line 373
    invoke-static {v13, v14, v15}, Ll5/e;->v0(Ljava/lang/CharSequence;Ljava/lang/String;I)I

    .line 374
    .line 375
    .line 376
    move-result v13

    .line 377
    add-int/2addr v13, v10

    .line 378
    invoke-virtual {v12, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v10

    .line 382
    const-string v12, "substring(...)"

    .line 383
    .line 384
    invoke-static {v10, v12}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    :try_start_0
    invoke-virtual {v2}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 388
    .line 389
    .line 390
    move-result-object v12

    .line 391
    invoke-static {v12, v10}, Ldev/jahir/kuper/extensions/ContextKt;->isAppInstalled(Landroid/content/Context;Ljava/lang/String;)Z

    .line 392
    .line 393
    .line 394
    move-result v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 395
    :try_start_1
    invoke-virtual {v2}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 396
    .line 397
    .line 398
    move-result-object v13

    .line 399
    invoke-virtual {v13}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 400
    .line 401
    .line 402
    move-result-object v13

    .line 403
    invoke-virtual {v13, v10}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 404
    .line 405
    .line 406
    move-result-object v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 407
    goto :goto_a

    .line 408
    :catch_0
    nop

    .line 409
    goto :goto_9

    .line 410
    :catch_1
    nop

    .line 411
    const/4 v12, 0x0

    .line 412
    :goto_9
    move-object v13, v4

    .line 413
    :goto_a
    if-nez v13, :cond_e

    .line 414
    .line 415
    if-eqz v9, :cond_e

    .line 416
    .line 417
    new-instance v13, Landroid/content/Intent;

    .line 418
    .line 419
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v9

    .line 423
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 424
    .line 425
    .line 426
    move-result-object v9

    .line 427
    const-string v10, "android.intent.action.VIEW"

    .line 428
    .line 429
    invoke-direct {v13, v10, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 430
    .line 431
    .line 432
    :cond_e
    move/from16 v24, v12

    .line 433
    .line 434
    move-object/from16 v25, v13

    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_f
    move-object/from16 v25, v4

    .line 438
    .line 439
    const/16 v24, 0x0

    .line 440
    .line 441
    :goto_b
    if-eqz v23, :cond_11

    .line 442
    .line 443
    if-eqz v24, :cond_10

    .line 444
    .line 445
    sget v9, Ldev/jahir/blueprint/R$drawable;->ic_open_app:I

    .line 446
    .line 447
    goto :goto_c

    .line 448
    :cond_10
    sget v9, Ldev/jahir/frames/R$drawable;->ic_download:I

    .line 449
    .line 450
    goto :goto_c

    .line 451
    :cond_11
    sget v9, Ldev/jahir/blueprint/R$drawable;->ic_open_app:I

    .line 452
    .line 453
    :goto_c
    new-instance v17, Ldev/jahir/blueprint/data/models/HomeItem;

    .line 454
    .line 455
    invoke-virtual {v8}, Ldev/jahir/blueprint/data/models/DefHomeItem;->getTitle()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v18

    .line 459
    invoke-virtual {v8}, Ldev/jahir/blueprint/data/models/DefHomeItem;->getDesc()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v19

    .line 463
    invoke-virtual {v8}, Ldev/jahir/blueprint/data/models/DefHomeItem;->getUrl()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v20

    .line 467
    invoke-virtual {v2}, Landroidx/lifecycle/a;->getApplication()Landroid/app/Application;

    .line 468
    .line 469
    .line 470
    move-result-object v10

    .line 471
    invoke-virtual {v8}, Ldev/jahir/blueprint/data/models/DefHomeItem;->getIcon()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v8

    .line 475
    invoke-static {v10, v8}, Ldev/jahir/frames/extensions/context/ContextKt;->drawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 476
    .line 477
    .line 478
    move-result-object v21

    .line 479
    new-instance v8, Ljava/lang/Integer;

    .line 480
    .line 481
    invoke-direct {v8, v9}, Ljava/lang/Integer;-><init>(I)V

    .line 482
    .line 483
    .line 484
    move-object/from16 v22, v8

    .line 485
    .line 486
    invoke-direct/range {v17 .. v25}, Ldev/jahir/blueprint/data/models/HomeItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;ZZLandroid/content/Intent;)V

    .line 487
    .line 488
    .line 489
    move-object/from16 v8, v17

    .line 490
    .line 491
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    goto/16 :goto_6

    .line 495
    .line 496
    :cond_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 500
    .line 501
    .line 502
    :cond_13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    const/4 v15, 0x6

    .line 507
    if-le v2, v15, :cond_14

    .line 508
    .line 509
    const/4 v10, 0x6

    .line 510
    goto :goto_d

    .line 511
    :cond_14
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 512
    .line 513
    .line 514
    move-result v10

    .line 515
    :goto_d
    new-instance v2, Ljava/util/ArrayList;

    .line 516
    .line 517
    const/4 v12, 0x0

    .line 518
    invoke-virtual {v1, v12, v10}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 523
    .line 524
    .line 525
    return-object v2

    .line 526
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 527
    .line 528
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 529
    .line 530
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    throw v1
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
