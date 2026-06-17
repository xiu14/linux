.class public final Lw1/c;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lw1/c;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lw1/c;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
.method public final a(Landroidx/lifecycle/w;Landroidx/lifecycle/n;)V
    .locals 8

    .line 1
    iget v0, p0, Lw1/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lw1/c;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lb/q;

    .line 9
    .line 10
    invoke-static {p1}, Lb/q;->access$ensureViewModelStore(Lb/q;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lb/q;->getLifecycle()Landroidx/lifecycle/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, p0}, Landroidx/lifecycle/p;->c(Landroidx/lifecycle/v;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    sget-object v0, Landroidx/lifecycle/n;->ON_CREATE:Landroidx/lifecycle/n;

    .line 22
    .line 23
    if-ne p2, v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/p;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, p0}, Landroidx/lifecycle/p;->c(Landroidx/lifecycle/v;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lw1/c;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Landroidx/lifecycle/u0;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/lifecycle/u0;->c()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v0, "Next event must be ON_CREATE, it was "

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p2

    .line 64
    :pswitch_1
    new-instance p1, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lw1/c;->i:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, [Landroidx/lifecycle/i;

    .line 72
    .line 73
    array-length p2, p1

    .line 74
    const/4 v0, 0x0

    .line 75
    const/4 v1, 0x0

    .line 76
    if-gtz p2, :cond_2

    .line 77
    .line 78
    array-length p2, p1

    .line 79
    if-gtz p2, :cond_1

    .line 80
    .line 81
    return-void

    .line 82
    :cond_1
    aget-object p1, p1, v1

    .line 83
    .line 84
    throw v0

    .line 85
    :cond_2
    aget-object p1, p1, v1

    .line 86
    .line 87
    throw v0

    .line 88
    :pswitch_2
    iget-object v0, p0, Lw1/c;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lw1/h;

    .line 91
    .line 92
    sget-object v1, Landroidx/lifecycle/n;->ON_CREATE:Landroidx/lifecycle/n;

    .line 93
    .line 94
    if-ne p2, v1, :cond_a

    .line 95
    .line 96
    invoke-interface {p1}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/p;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1, p0}, Landroidx/lifecycle/p;->c(Landroidx/lifecycle/v;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v0}, Lw1/h;->getSavedStateRegistry()Lw1/f;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const-string p2, "androidx.savedstate.Restarter"

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Lw1/f;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-nez p1, :cond_3

    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_3
    const-string p2, "classes_to_restore"

    .line 118
    .line 119
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-eqz p1, :cond_9

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    const/4 v1, 0x0

    .line 130
    const/4 v2, 0x0

    .line 131
    :cond_4
    :goto_0
    if-ge v2, p2, :cond_8

    .line 132
    .line 133
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    add-int/lit8 v2, v2, 0x1

    .line 138
    .line 139
    check-cast v3, Ljava/lang/String;

    .line 140
    .line 141
    const-string v4, "Class "

    .line 142
    .line 143
    :try_start_0
    const-class v5, Lw1/c;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v3, v1, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    const-class v6, Lw1/d;

    .line 154
    .line 155
    invoke-virtual {v5, v6}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v5}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 160
    .line 161
    .line 162
    const/4 v6, 0x0

    .line 163
    :try_start_1
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 164
    .line 165
    .line 166
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 167
    const/4 v5, 0x1

    .line 168
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 169
    .line 170
    .line 171
    :try_start_2
    invoke-virtual {v4, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-static {v4}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    check-cast v4, Lw1/d;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 179
    .line 180
    instance-of v3, v0, Landroidx/lifecycle/e1;

    .line 181
    .line 182
    if-eqz v3, :cond_7

    .line 183
    .line 184
    move-object v3, v0

    .line 185
    check-cast v3, Landroidx/lifecycle/e1;

    .line 186
    .line 187
    invoke-interface {v3}, Landroidx/lifecycle/e1;->getViewModelStore()Landroidx/lifecycle/d1;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-interface {v0}, Lw1/h;->getSavedStateRegistry()Lw1/f;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object v3, v3, Landroidx/lifecycle/d1;->a:Ljava/util/LinkedHashMap;

    .line 199
    .line 200
    new-instance v5, Ljava/util/HashSet;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-eqz v6, :cond_6

    .line 218
    .line 219
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    check-cast v6, Ljava/lang/String;

    .line 224
    .line 225
    const-string v7, "key"

    .line 226
    .line 227
    invoke-static {v6, v7}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    check-cast v6, Landroidx/lifecycle/z0;

    .line 235
    .line 236
    if-nez v6, :cond_5

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_5
    invoke-interface {v0}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/p;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-static {v6, v4, v7}, Landroidx/lifecycle/t0;->a(Landroidx/lifecycle/z0;Lw1/f;Landroidx/lifecycle/p;)V

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_6
    new-instance v5, Ljava/util/HashSet;

    .line 248
    .line 249
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-direct {v5, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v5}, Ljava/util/HashSet;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-nez v3, :cond_4

    .line 261
    .line 262
    invoke-virtual {v4}, Lw1/f;->d()V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string p2, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "

    .line 270
    .line 271
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw p2

    .line 291
    :catch_0
    move-exception p1

    .line 292
    new-instance p2, Ljava/lang/RuntimeException;

    .line 293
    .line 294
    const-string v0, "Failed to instantiate "

    .line 295
    .line 296
    invoke-static {v0, v3}, Lz1/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    throw p2

    .line 304
    :catch_1
    move-exception p1

    .line 305
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 306
    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    const-string v1, " must have default constructor in order to be automatically recreated"

    .line 320
    .line 321
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 329
    .line 330
    .line 331
    throw p2

    .line 332
    :catch_2
    move-exception p1

    .line 333
    new-instance p2, Ljava/lang/RuntimeException;

    .line 334
    .line 335
    const-string v0, " wasn\'t found"

    .line 336
    .line 337
    invoke-static {v4, v3, v0}, Landroidx/appcompat/app/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    throw p2

    .line 345
    :cond_8
    :goto_2
    return-void

    .line 346
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 347
    .line 348
    const-string p2, "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 349
    .line 350
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw p1

    .line 354
    :cond_a
    new-instance p1, Ljava/lang/AssertionError;

    .line 355
    .line 356
    const-string p2, "Next event must be ON_CREATE"

    .line 357
    .line 358
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    throw p1

    .line 362
    nop

    .line 363
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
