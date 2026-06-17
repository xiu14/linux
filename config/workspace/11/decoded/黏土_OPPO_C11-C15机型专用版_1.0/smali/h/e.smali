.class public final Lh/e;
.super Lh/g;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lf0/g;


# instance fields
.field public A:Z

.field public u:Lh/b;

.field public v:Z

.field public w:Lh/b;

.field public x:Lu2/f;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lh/b;Landroid/content/res/Resources;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xff

    .line 5
    .line 6
    iput v0, p0, Lh/g;->l:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lh/g;->n:I

    .line 10
    .line 11
    iput v0, p0, Lh/e;->y:I

    .line 12
    .line 13
    iput v0, p0, Lh/e;->z:I

    .line 14
    .line 15
    new-instance v0, Lh/b;

    .line 16
    .line 17
    invoke-direct {v0, p1, p0, p2}, Lh/b;-><init>(Lh/b;Lh/e;Landroid/content/res/Resources;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lh/e;->d(Lh/b;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Lh/e;->onStateChange([I)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lh/e;->jumpToCurrentState()V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public static e(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lh/e;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 1
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 2
    const-string v6, "animated-selector"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    .line 3
    new-instance v5, Lh/e;

    const/4 v6, 0x0

    .line 4
    invoke-direct {v5, v6, v6}, Lh/e;-><init>(Lh/b;Landroid/content/res/Resources;)V

    .line 5
    sget-object v7, Li/c;->AnimatedStateListDrawableCompat:[I

    invoke-static {v1, v4, v3, v7}, Ld0/b;->h(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v7

    .line 6
    sget v8, Li/c;->AnimatedStateListDrawableCompat_android_visible:I

    const/4 v9, 0x1

    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    invoke-virtual {v5, v8, v9}, Lh/e;->setVisible(ZZ)Z

    .line 7
    iget-object v8, v5, Lh/e;->w:Lh/b;

    .line 8
    iget v10, v8, Lh/b;->d:I

    invoke-static {v7}, Li/a;->b(Landroid/content/res/TypedArray;)I

    move-result v11

    or-int/2addr v10, v11

    iput v10, v8, Lh/b;->d:I

    .line 9
    sget v10, Li/c;->AnimatedStateListDrawableCompat_android_variablePadding:I

    iget-boolean v11, v8, Lh/b;->i:Z

    .line 10
    invoke-virtual {v7, v10, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    .line 11
    iput-boolean v10, v8, Lh/b;->i:Z

    .line 12
    sget v10, Li/c;->AnimatedStateListDrawableCompat_android_constantSize:I

    iget-boolean v11, v8, Lh/b;->l:Z

    .line 13
    invoke-virtual {v7, v10, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    .line 14
    iput-boolean v10, v8, Lh/b;->l:Z

    .line 15
    sget v10, Li/c;->AnimatedStateListDrawableCompat_android_enterFadeDuration:I

    iget v11, v8, Lh/b;->y:I

    .line 16
    invoke-virtual {v7, v10, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    .line 17
    iput v10, v8, Lh/b;->y:I

    .line 18
    sget v10, Li/c;->AnimatedStateListDrawableCompat_android_exitFadeDuration:I

    iget v11, v8, Lh/b;->z:I

    .line 19
    invoke-virtual {v7, v10, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    .line 20
    iput v10, v8, Lh/b;->z:I

    .line 21
    sget v10, Li/c;->AnimatedStateListDrawableCompat_android_dither:I

    iget-boolean v8, v8, Lh/b;->w:Z

    invoke-virtual {v7, v10, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v8

    invoke-virtual {v5, v8}, Lh/g;->setDither(Z)V

    .line 22
    iget-object v8, v5, Lh/g;->h:Lh/b;

    const/4 v10, 0x0

    if-eqz v1, :cond_1

    .line 23
    iput-object v1, v8, Lh/b;->b:Landroid/content/res/Resources;

    .line 24
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    iget v11, v11, Landroid/util/DisplayMetrics;->densityDpi:I

    if-nez v11, :cond_0

    const/16 v11, 0xa0

    .line 25
    :cond_0
    iget v12, v8, Lh/b;->c:I

    .line 26
    iput v11, v8, Lh/b;->c:I

    if-eq v12, v11, :cond_2

    .line 27
    iput-boolean v10, v8, Lh/b;->m:Z

    .line 28
    iput-boolean v10, v8, Lh/b;->j:Z

    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v7

    add-int/2addr v7, v9

    .line 32
    :goto_1
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v8

    if-eq v8, v9, :cond_1a

    .line 33
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v11

    if-ge v11, v7, :cond_3

    const/4 v12, 0x3

    if-eq v8, v12, :cond_1a

    :cond_3
    const/4 v12, 0x2

    if-eq v8, v12, :cond_4

    goto :goto_1

    :cond_4
    if-le v11, v7, :cond_5

    goto :goto_1

    .line 34
    :cond_5
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v11, "item"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const/4 v13, -0x1

    if-eqz v8, :cond_f

    .line 35
    sget-object v8, Li/c;->AnimatedStateListDrawableItem:[I

    invoke-static {v1, v4, v3, v8}, Ld0/b;->h(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v8

    .line 36
    sget v14, Li/c;->AnimatedStateListDrawableItem_android_id:I

    invoke-virtual {v8, v14, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    .line 37
    sget v15, Li/c;->AnimatedStateListDrawableItem_android_drawable:I

    .line 38
    invoke-virtual {v8, v15, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v13

    if-lez v13, :cond_6

    .line 39
    invoke-static {}, Landroidx/appcompat/widget/z2;->d()Landroidx/appcompat/widget/z2;

    move-result-object v15

    invoke-virtual {v15, v0, v13}, Landroidx/appcompat/widget/z2;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    goto :goto_2

    :cond_6
    move-object v13, v6

    .line 40
    :goto_2
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 41
    invoke-interface {v3}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v8

    .line 42
    new-array v15, v8, [I

    const/4 v6, 0x0

    const/4 v9, 0x0

    :goto_3
    if-ge v6, v8, :cond_9

    .line 43
    invoke-interface {v3, v6}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    move-result v12

    if-eqz v12, :cond_8

    const v11, 0x10100d0

    if-eq v12, v11, :cond_8

    const v11, 0x1010199

    if-eq v12, v11, :cond_8

    add-int/lit8 v11, v9, 0x1

    .line 44
    invoke-interface {v3, v6, v10}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    move-result v18

    if-eqz v18, :cond_7

    goto :goto_4

    :cond_7
    neg-int v12, v12

    .line 45
    :goto_4
    aput v12, v15, v9

    move v9, v11

    :cond_8
    add-int/lit8 v6, v6, 0x1

    const/4 v12, 0x2

    goto :goto_3

    .line 46
    :cond_9
    invoke-static {v15, v9}, Landroid/util/StateSet;->trimStateSet([II)[I

    move-result-object v6

    .line 47
    const-string v8, ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"

    if-nez v13, :cond_d

    .line 48
    :goto_5
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v9

    const/4 v11, 0x4

    if-ne v9, v11, :cond_a

    goto :goto_5

    :cond_a
    const/4 v11, 0x2

    if-ne v9, v11, :cond_c

    .line 49
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v11, "vector"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    .line 50
    new-instance v13, Lh2/r;

    invoke-direct {v13}, Lh2/r;-><init>()V

    .line 51
    invoke-virtual {v13, v1, v2, v3, v4}, Lh2/r;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    goto :goto_6

    .line 52
    :cond_b
    invoke-static/range {p1 .. p4}, Li/a;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    goto :goto_6

    .line 53
    :cond_c
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_6
    if-eqz v13, :cond_e

    .line 55
    iget-object v8, v5, Lh/e;->w:Lh/b;

    .line 56
    invoke-virtual {v8, v13}, Lh/b;->a(Landroid/graphics/drawable/Drawable;)I

    move-result v9

    .line 57
    iget-object v11, v8, Lh/b;->H:[[I

    aput-object v6, v11, v9

    .line 58
    iget-object v6, v8, Lh/b;->J:Lq/l;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v9, v8}, Lq/l;->e(ILjava/lang/Object;)V

    :goto_7
    const/4 v6, 0x0

    const/4 v9, 0x1

    goto/16 :goto_1

    .line 59
    :cond_e
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_f
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v8, "transition"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    .line 62
    sget-object v6, Li/c;->AnimatedStateListDrawableTransition:[I

    invoke-static {v1, v4, v3, v6}, Ld0/b;->h(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 63
    sget v8, Li/c;->AnimatedStateListDrawableTransition_android_fromId:I

    invoke-virtual {v6, v8, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    .line 64
    sget v9, Li/c;->AnimatedStateListDrawableTransition_android_toId:I

    invoke-virtual {v6, v9, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    .line 65
    sget v11, Li/c;->AnimatedStateListDrawableTransition_android_drawable:I

    invoke-virtual {v6, v11, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    if-lez v11, :cond_10

    .line 66
    invoke-static {}, Landroidx/appcompat/widget/z2;->d()Landroidx/appcompat/widget/z2;

    move-result-object v12

    invoke-virtual {v12, v0, v11}, Landroidx/appcompat/widget/z2;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    goto :goto_8

    :cond_10
    const/4 v11, 0x0

    .line 67
    :goto_8
    sget v12, Li/c;->AnimatedStateListDrawableTransition_android_reversible:I

    invoke-virtual {v6, v12, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    .line 68
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 69
    const-string v6, ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"

    if-nez v11, :cond_14

    .line 70
    :goto_9
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v11

    const/4 v14, 0x4

    if-ne v11, v14, :cond_11

    goto :goto_9

    :cond_11
    const/4 v15, 0x2

    if-ne v11, v15, :cond_13

    .line 71
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v14, "animated-vector"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_12

    .line 72
    new-instance v11, Lh2/f;

    .line 73
    invoke-direct {v11, v0, v10}, Lh2/f;-><init>(Landroid/content/Context;I)V

    .line 74
    invoke-virtual {v11, v1, v2, v3, v4}, Lh2/f;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    goto :goto_a

    .line 75
    :cond_12
    invoke-static/range {p1 .. p4}, Li/a;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    goto :goto_a

    .line 76
    :cond_13
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    :goto_a
    if-eqz v11, :cond_18

    if-eq v8, v13, :cond_17

    if-eq v9, v13, :cond_17

    .line 78
    iget-object v6, v5, Lh/e;->w:Lh/b;

    .line 79
    invoke-virtual {v6, v11}, Lh/b;->a(Landroid/graphics/drawable/Drawable;)I

    move-result v11

    int-to-long v13, v8

    const/16 v8, 0x20

    shl-long v16, v13, v8

    const/16 v15, 0x20

    int-to-long v8, v9

    move/from16 v19, v11

    or-long v10, v16, v8

    if-eqz v12, :cond_15

    const-wide v16, 0x200000000L

    :goto_b
    const/16 v20, 0x20

    goto :goto_c

    :cond_15
    const-wide/16 v16, 0x0

    goto :goto_b

    .line 80
    :goto_c
    iget-object v15, v6, Lh/b;->I:Lq/i;

    move/from16 v0, v19

    int-to-long v0, v0

    or-long v21, v0, v16

    move-wide/from16 v23, v0

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v15, v10, v11, v0}, Lq/i;->a(JLjava/lang/Long;)V

    if-eqz v12, :cond_16

    shl-long v0, v8, v20

    or-long/2addr v0, v13

    .line 81
    iget-object v6, v6, Lh/b;->I:Lq/i;

    const-wide v8, 0x100000000L

    or-long v8, v23, v8

    or-long v8, v8, v16

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v0, v1, v8}, Lq/i;->a(JLjava/lang/Long;)V

    :cond_16
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v6, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    goto/16 :goto_1

    .line 82
    :cond_17
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": <transition> tag requires \'fromId\' & \'toId\' attributes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_18
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_7

    .line 86
    :cond_1a
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {v5, v0}, Lh/e;->onStateChange([I)Z

    return-object v5

    .line 87
    :cond_1b
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": invalid animated-selector tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lh/g;->applyTheme(Landroid/content/res/Resources$Theme;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Lh/e;->onStateChange([I)Z

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final d(Lh/b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lh/g;->h:Lh/b;

    .line 2
    .line 3
    iget v0, p0, Lh/g;->n:I

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lh/b;->d(I)Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lh/g;->j:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lh/g;->b(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lh/g;->k:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    iput-object p1, p0, Lh/e;->u:Lh/b;

    .line 22
    .line 23
    iput-object p1, p0, Lh/e;->w:Lh/b;

    .line 24
    .line 25
    return-void
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

.method public final f()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh/e;->v:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Lh/g;->mutate()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lh/e;->u:Lh/b;

    .line 9
    .line 10
    iget-object v1, v0, Lh/b;->I:Lq/i;

    .line 11
    .line 12
    invoke-virtual {v1}, Lq/i;->d()Lq/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lh/b;->I:Lq/i;

    .line 17
    .line 18
    iget-object v1, v0, Lh/b;->J:Lq/l;

    .line 19
    .line 20
    invoke-virtual {v1}, Lq/l;->c()Lq/l;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, Lh/b;->J:Lq/l;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lh/e;->v:Z

    .line 28
    .line 29
    :cond_0
    return-object p0
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final isStateful()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method public final jumpToCurrentState()V
    .locals 1

    .line 1
    invoke-super {p0}, Lh/g;->jumpToCurrentState()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh/e;->x:Lu2/f;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lu2/f;->O()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lh/e;->x:Lu2/f;

    .line 13
    .line 14
    iget v0, p0, Lh/e;->y:I

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lh/g;->c(I)Z

    .line 17
    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    iput v0, p0, Lh/e;->y:I

    .line 21
    .line 22
    iput v0, p0, Lh/e;->z:I

    .line 23
    .line 24
    :cond_0
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
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lh/e;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lh/e;->f()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lh/e;->w:Lh/b;

    .line 9
    .line 10
    iget-object v1, v0, Lh/b;->I:Lq/i;

    .line 11
    .line 12
    invoke-virtual {v1}, Lq/i;->d()Lq/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lh/b;->I:Lq/i;

    .line 17
    .line 18
    iget-object v1, v0, Lh/b;->J:Lq/l;

    .line 19
    .line 20
    invoke-virtual {v1}, Lq/l;->c()Lq/l;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, Lh/b;->J:Lq/l;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lh/e;->A:Z

    .line 28
    .line 29
    :cond_0
    return-object p0
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final onStateChange([I)Z
    .locals 13

    .line 1
    iget-object v0, p0, Lh/e;->w:Lh/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh/b;->f([I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ltz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v1, Landroid/util/StateSet;->WILD_CARD:[I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lh/b;->f([I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    :goto_0
    iget v0, p0, Lh/g;->n:I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eq v1, v0, :cond_b

    .line 20
    .line 21
    iget-object v3, p0, Lh/e;->x:Lu2/f;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-eqz v3, :cond_3

    .line 25
    .line 26
    iget v0, p0, Lh/e;->y:I

    .line 27
    .line 28
    if-ne v1, v0, :cond_1

    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_1
    iget v0, p0, Lh/e;->z:I

    .line 33
    .line 34
    if-ne v1, v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v3}, Lu2/f;->d()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3}, Lu2/f;->F()V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lh/e;->z:I

    .line 46
    .line 47
    iput v0, p0, Lh/e;->y:I

    .line 48
    .line 49
    iput v1, p0, Lh/e;->z:I

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_2
    iget v0, p0, Lh/e;->y:I

    .line 54
    .line 55
    invoke-virtual {v3}, Lu2/f;->O()V

    .line 56
    .line 57
    .line 58
    :cond_3
    const/4 v3, 0x0

    .line 59
    iput-object v3, p0, Lh/e;->x:Lu2/f;

    .line 60
    .line 61
    const/4 v3, -0x1

    .line 62
    iput v3, p0, Lh/e;->z:I

    .line 63
    .line 64
    iput v3, p0, Lh/e;->y:I

    .line 65
    .line 66
    iget-object v3, p0, Lh/e;->w:Lh/b;

    .line 67
    .line 68
    invoke-virtual {v3, v0}, Lh/b;->e(I)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {v3, v1}, Lh/b;->e(I)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_a

    .line 77
    .line 78
    if-nez v5, :cond_4

    .line 79
    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :cond_4
    int-to-long v7, v5

    .line 83
    const/16 v5, 0x20

    .line 84
    .line 85
    shl-long/2addr v7, v5

    .line 86
    int-to-long v5, v6

    .line 87
    or-long/2addr v5, v7

    .line 88
    iget-object v7, v3, Lh/b;->I:Lq/i;

    .line 89
    .line 90
    invoke-virtual {v7, v5, v6}, Lq/i;->f(J)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Ljava/lang/Long;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    long-to-int v8, v7

    .line 101
    if-gez v8, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    iget-object v7, v3, Lh/b;->I:Lq/i;

    .line 105
    .line 106
    invoke-virtual {v7, v5, v6}, Lq/i;->f(J)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    check-cast v7, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v9

    .line 116
    const-wide v11, 0x200000000L

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    and-long/2addr v9, v11

    .line 122
    const-wide/16 v11, 0x0

    .line 123
    .line 124
    cmp-long v7, v9, v11

    .line 125
    .line 126
    if-eqz v7, :cond_6

    .line 127
    .line 128
    const/4 v7, 0x1

    .line 129
    goto :goto_1

    .line 130
    :cond_6
    const/4 v7, 0x0

    .line 131
    :goto_1
    invoke-virtual {p0, v8}, Lh/g;->c(I)Z

    .line 132
    .line 133
    .line 134
    iget-object v8, p0, Lh/g;->j:Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    instance-of v9, v8, Landroid/graphics/drawable/AnimationDrawable;

    .line 137
    .line 138
    if-eqz v9, :cond_8

    .line 139
    .line 140
    iget-object v3, v3, Lh/b;->I:Lq/i;

    .line 141
    .line 142
    invoke-virtual {v3, v5, v6}, Lq/i;->f(J)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Ljava/lang/Long;

    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 149
    .line 150
    .line 151
    move-result-wide v5

    .line 152
    const-wide v9, 0x100000000L

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    and-long/2addr v5, v9

    .line 158
    cmp-long v3, v5, v11

    .line 159
    .line 160
    if-eqz v3, :cond_7

    .line 161
    .line 162
    const/4 v2, 0x1

    .line 163
    :cond_7
    new-instance v3, Lh/c;

    .line 164
    .line 165
    check-cast v8, Landroid/graphics/drawable/AnimationDrawable;

    .line 166
    .line 167
    invoke-direct {v3, v8, v2, v7}, Lh/c;-><init>(Landroid/graphics/drawable/AnimationDrawable;ZZ)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_8
    instance-of v3, v8, Lh2/f;

    .line 172
    .line 173
    if-eqz v3, :cond_9

    .line 174
    .line 175
    new-instance v3, Lh/a;

    .line 176
    .line 177
    check-cast v8, Lh2/f;

    .line 178
    .line 179
    const/4 v2, 0x1

    .line 180
    invoke-direct {v3, v8, v2}, Lh/a;-><init>(Landroid/graphics/drawable/Animatable;I)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_9
    instance-of v3, v8, Landroid/graphics/drawable/Animatable;

    .line 185
    .line 186
    if-eqz v3, :cond_a

    .line 187
    .line 188
    new-instance v3, Lh/a;

    .line 189
    .line 190
    check-cast v8, Landroid/graphics/drawable/Animatable;

    .line 191
    .line 192
    const/4 v2, 0x0

    .line 193
    invoke-direct {v3, v8, v2}, Lh/a;-><init>(Landroid/graphics/drawable/Animatable;I)V

    .line 194
    .line 195
    .line 196
    :goto_2
    invoke-virtual {v3}, Lu2/f;->M()V

    .line 197
    .line 198
    .line 199
    iput-object v3, p0, Lh/e;->x:Lu2/f;

    .line 200
    .line 201
    iput v0, p0, Lh/e;->z:I

    .line 202
    .line 203
    iput v1, p0, Lh/e;->y:I

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_a
    :goto_3
    invoke-virtual {p0, v1}, Lh/g;->c(I)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_b

    .line 211
    .line 212
    :goto_4
    const/4 v2, 0x1

    .line 213
    :cond_b
    iget-object v0, p0, Lh/g;->j:Landroid/graphics/drawable/Drawable;

    .line 214
    .line 215
    if-eqz v0, :cond_c

    .line 216
    .line 217
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    or-int/2addr p1, v2

    .line 222
    return p1

    .line 223
    :cond_c
    return v2
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
.end method

.method public final setVisible(ZZ)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lh/g;->setVisible(ZZ)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lh/e;->x:Lu2/f;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-eqz p2, :cond_2

    .line 12
    .line 13
    :cond_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Lu2/f;->M()V

    .line 16
    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/e;->jumpToCurrentState()V

    .line 20
    .line 21
    .line 22
    :cond_2
    return v0
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
