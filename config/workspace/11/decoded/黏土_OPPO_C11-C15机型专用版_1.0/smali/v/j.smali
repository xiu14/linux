.class public abstract Lv/j;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Z

    .line 3
    .line 4
    sput-object v0, Lv/j;->a:[Z

    .line 5
    .line 6
    return-void
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

.method public static a(Lv/e;Lu/e;I)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez p2, :cond_0

    .line 1
    iget v2, v0, Lv/e;->l0:I

    .line 2
    iget-object v3, v0, Lv/e;->o0:[Lv/b;

    const/4 v14, 0x0

    :goto_0
    move v12, v2

    move-object v13, v3

    goto :goto_1

    .line 3
    :cond_0
    iget v2, v0, Lv/e;->m0:I

    .line 4
    iget-object v3, v0, Lv/e;->n0:[Lv/b;

    const/4 v14, 0x2

    goto :goto_0

    :goto_1
    const/4 v15, 0x0

    :goto_2
    if-ge v15, v12, :cond_6c

    .line 5
    aget-object v2, v13, v15

    .line 6
    iget-boolean v3, v2, Lv/b;->q:Z

    iget-object v4, v2, Lv/b;->a:Lv/d;

    iget-object v5, v4, Lv/d;->F:[Lv/c;

    const/4 v6, 0x3

    const/16 v16, 0x0

    const/16 v7, 0x8

    if-nez v3, :cond_19

    .line 7
    iget v3, v2, Lv/b;->l:I

    mul-int/lit8 v17, v3, 0x2

    move-object v8, v4

    move-object v11, v8

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_3
    if-nez v18, :cond_14

    const/16 v21, 0x1

    .line 8
    iget v9, v2, Lv/b;->i:I

    add-int/lit8 v9, v9, 0x1

    iput v9, v2, Lv/b;->i:I

    .line 9
    iget-object v9, v8, Lv/d;->b0:[Lv/d;

    iget-object v10, v8, Lv/d;->F:[Lv/c;

    aput-object v16, v9, v3

    .line 10
    iget-object v9, v8, Lv/d;->a0:[Lv/d;

    aput-object v16, v9, v3

    .line 11
    iget v9, v8, Lv/d;->V:I

    if-eq v9, v7, :cond_e

    .line 12
    invoke-virtual {v8, v3}, Lv/d;->h(I)I

    .line 13
    aget-object v9, v10, v17

    invoke-virtual {v9}, Lv/c;->c()I

    add-int/lit8 v9, v17, 0x1

    .line 14
    aget-object v23, v10, v9

    invoke-virtual/range {v23 .. v23}, Lv/c;->c()I

    .line 15
    aget-object v23, v10, v17

    invoke-virtual/range {v23 .. v23}, Lv/c;->c()I

    .line 16
    aget-object v9, v10, v9

    invoke-virtual {v9}, Lv/c;->c()I

    .line 17
    iget-object v9, v2, Lv/b;->b:Lv/d;

    if-nez v9, :cond_1

    .line 18
    iput-object v8, v2, Lv/b;->b:Lv/d;

    .line 19
    :cond_1
    iput-object v8, v2, Lv/b;->d:Lv/d;

    .line 20
    iget-object v9, v8, Lv/d;->c0:[I

    aget v9, v9, v3

    if-ne v9, v6, :cond_e

    .line 21
    iget-object v7, v8, Lv/d;->l:[I

    aget v7, v7, v3

    if-eqz v7, :cond_3

    if-eq v7, v6, :cond_3

    const/4 v6, 0x2

    if-ne v7, v6, :cond_2

    goto :goto_4

    :cond_2
    move/from16 v25, v3

    move-object/from16 v26, v5

    goto :goto_7

    .line 22
    :cond_3
    :goto_4
    iget v6, v2, Lv/b;->j:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v2, Lv/b;->j:I

    .line 23
    iget-object v6, v8, Lv/d;->Z:[F

    aget v6, v6, v3

    cmpl-float v25, v6, v19

    if-lez v25, :cond_4

    move/from16 v25, v3

    .line 24
    iget v3, v2, Lv/b;->k:F

    add-float/2addr v3, v6

    iput v3, v2, Lv/b;->k:F

    goto :goto_5

    :cond_4
    move/from16 v25, v3

    .line 25
    :goto_5
    iget v3, v8, Lv/d;->V:I

    move-object/from16 v26, v5

    const/16 v5, 0x8

    if-eq v3, v5, :cond_8

    const/4 v3, 0x3

    if-ne v9, v3, :cond_8

    if-eqz v7, :cond_5

    if-ne v7, v3, :cond_8

    :cond_5
    cmpg-float v3, v6, v19

    if-gez v3, :cond_6

    const/4 v3, 0x1

    .line 26
    iput-boolean v3, v2, Lv/b;->n:Z

    goto :goto_6

    :cond_6
    const/4 v3, 0x1

    .line 27
    iput-boolean v3, v2, Lv/b;->o:Z

    .line 28
    :goto_6
    iget-object v3, v2, Lv/b;->h:Ljava/util/ArrayList;

    if-nez v3, :cond_7

    .line 29
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Lv/b;->h:Ljava/util/ArrayList;

    .line 30
    :cond_7
    iget-object v3, v2, Lv/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_8
    iget-object v3, v2, Lv/b;->f:Lv/d;

    if-nez v3, :cond_9

    .line 32
    iput-object v8, v2, Lv/b;->f:Lv/d;

    .line 33
    :cond_9
    iget-object v3, v2, Lv/b;->g:Lv/d;

    if-eqz v3, :cond_a

    .line 34
    iget-object v3, v3, Lv/d;->a0:[Lv/d;

    aput-object v8, v3, v25

    .line 35
    :cond_a
    iput-object v8, v2, Lv/b;->g:Lv/d;

    :goto_7
    if-nez v25, :cond_c

    .line 36
    iget v3, v8, Lv/d;->j:I

    if-eqz v3, :cond_b

    goto :goto_8

    .line 37
    :cond_b
    iget v3, v8, Lv/d;->m:I

    if-nez v3, :cond_f

    iget v3, v8, Lv/d;->n:I

    goto :goto_8

    .line 38
    :cond_c
    iget v3, v8, Lv/d;->k:I

    if-eqz v3, :cond_d

    goto :goto_8

    .line 39
    :cond_d
    iget v3, v8, Lv/d;->p:I

    if-nez v3, :cond_f

    iget v3, v8, Lv/d;->q:I

    goto :goto_8

    :cond_e
    move/from16 v25, v3

    move-object/from16 v26, v5

    :cond_f
    :goto_8
    if-eq v11, v8, :cond_10

    .line 40
    iget-object v3, v11, Lv/d;->b0:[Lv/d;

    aput-object v8, v3, v25

    :cond_10
    add-int/lit8 v3, v17, 0x1

    .line 41
    aget-object v3, v10, v3

    iget-object v3, v3, Lv/c;->d:Lv/c;

    if-eqz v3, :cond_11

    .line 42
    iget-object v3, v3, Lv/c;->b:Lv/d;

    .line 43
    iget-object v5, v3, Lv/d;->F:[Lv/c;

    aget-object v5, v5, v17

    iget-object v5, v5, Lv/c;->d:Lv/c;

    if-eqz v5, :cond_11

    iget-object v5, v5, Lv/c;->b:Lv/d;

    if-eq v5, v8, :cond_12

    :cond_11
    move-object/from16 v3, v16

    :cond_12
    if-eqz v3, :cond_13

    goto :goto_9

    :cond_13
    move-object v3, v8

    const/16 v18, 0x1

    :goto_9
    move-object v11, v8

    move-object/from16 v5, v26

    const/4 v6, 0x3

    const/16 v7, 0x8

    move-object v8, v3

    move/from16 v3, v25

    goto/16 :goto_3

    :cond_14
    move/from16 v25, v3

    move-object/from16 v26, v5

    .line 44
    iget-object v3, v2, Lv/b;->b:Lv/d;

    if-eqz v3, :cond_15

    .line 45
    iget-object v3, v3, Lv/d;->F:[Lv/c;

    aget-object v3, v3, v17

    invoke-virtual {v3}, Lv/c;->c()I

    .line 46
    :cond_15
    iget-object v3, v2, Lv/b;->d:Lv/d;

    if-eqz v3, :cond_16

    .line 47
    iget-object v3, v3, Lv/d;->F:[Lv/c;

    add-int/lit8 v17, v17, 0x1

    aget-object v3, v3, v17

    invoke-virtual {v3}, Lv/c;->c()I

    .line 48
    :cond_16
    iput-object v8, v2, Lv/b;->c:Lv/d;

    if-nez v25, :cond_17

    .line 49
    iget-boolean v3, v2, Lv/b;->m:Z

    if-eqz v3, :cond_17

    .line 50
    iput-object v8, v2, Lv/b;->e:Lv/d;

    goto :goto_a

    .line 51
    :cond_17
    iput-object v4, v2, Lv/b;->e:Lv/d;

    .line 52
    :goto_a
    iget-boolean v3, v2, Lv/b;->o:Z

    if-eqz v3, :cond_18

    iget-boolean v3, v2, Lv/b;->n:Z

    if-eqz v3, :cond_18

    const/4 v3, 0x1

    goto :goto_b

    :cond_18
    const/4 v3, 0x0

    :goto_b
    iput-boolean v3, v2, Lv/b;->p:Z

    :goto_c
    const/4 v3, 0x1

    goto :goto_d

    :cond_19
    move-object/from16 v26, v5

    const/16 v19, 0x0

    goto :goto_c

    .line 53
    :goto_d
    iput-boolean v3, v2, Lv/b;->q:Z

    .line 54
    iget-object v10, v2, Lv/b;->c:Lv/d;

    .line 55
    iget-object v11, v2, Lv/b;->b:Lv/d;

    .line 56
    iget-object v3, v2, Lv/b;->d:Lv/d;

    .line 57
    iget-object v5, v2, Lv/b;->e:Lv/d;

    .line 58
    iget v6, v2, Lv/b;->k:F

    .line 59
    iget-object v7, v0, Lv/d;->c0:[I

    iget-object v8, v0, Lv/d;->F:[Lv/c;

    aget v7, v7, p2

    const/4 v9, 0x2

    if-ne v7, v9, :cond_1a

    const/4 v7, 0x1

    goto :goto_e

    :cond_1a
    const/4 v7, 0x0

    :goto_e
    if-nez p2, :cond_1e

    .line 60
    iget v9, v5, Lv/d;->X:I

    if-nez v9, :cond_1b

    const/16 v21, 0x1

    :goto_f
    move/from16 v17, v6

    const/4 v6, 0x1

    goto :goto_10

    :cond_1b
    const/16 v21, 0x0

    goto :goto_f

    :goto_10
    if-ne v9, v6, :cond_1c

    const/16 v18, 0x1

    :goto_11
    const/4 v6, 0x2

    goto :goto_12

    :cond_1c
    const/16 v18, 0x0

    goto :goto_11

    :goto_12
    if-ne v9, v6, :cond_1d

    const/4 v9, 0x1

    goto :goto_13

    :cond_1d
    const/4 v9, 0x0

    :goto_13
    move-object v6, v4

    move/from16 v28, v7

    move/from16 v25, v21

    :goto_14
    const/16 v22, 0x0

    goto :goto_1a

    :cond_1e
    move/from16 v17, v6

    const/4 v6, 0x2

    .line 61
    iget v9, v5, Lv/d;->Y:I

    if-nez v9, :cond_1f

    const/16 v22, 0x1

    :goto_15
    const/4 v6, 0x1

    goto :goto_16

    :cond_1f
    const/16 v22, 0x0

    goto :goto_15

    :goto_16
    if-ne v9, v6, :cond_20

    const/16 v18, 0x1

    :goto_17
    const/4 v6, 0x2

    goto :goto_18

    :cond_20
    const/16 v18, 0x0

    goto :goto_17

    :goto_18
    if-ne v9, v6, :cond_21

    const/4 v9, 0x1

    goto :goto_19

    :cond_21
    const/4 v9, 0x0

    :goto_19
    move-object v6, v4

    move/from16 v28, v7

    move/from16 v25, v22

    goto :goto_14

    :goto_1a
    if-nez v22, :cond_2e

    .line 62
    iget-object v7, v6, Lv/d;->F:[Lv/c;

    move-object/from16 v32, v7

    iget-object v7, v6, Lv/d;->c0:[I

    move-object/from16 v33, v7

    aget-object v7, v32, v14

    if-eqz v9, :cond_22

    const/16 v30, 0x1

    goto :goto_1b

    :cond_22
    const/16 v30, 0x4

    .line 63
    :goto_1b
    invoke-virtual {v7}, Lv/c;->c()I

    move-result v34

    move-object/from16 v35, v8

    .line 64
    aget v8, v33, p2

    move/from16 v36, v9

    const/4 v9, 0x3

    if-ne v8, v9, :cond_23

    iget-object v8, v6, Lv/d;->l:[I

    aget v8, v8, p2

    if-nez v8, :cond_23

    const/4 v8, 0x1

    goto :goto_1c

    :cond_23
    const/4 v8, 0x0

    .line 65
    :goto_1c
    iget-object v9, v7, Lv/c;->d:Lv/c;

    if-eqz v9, :cond_24

    if-eq v6, v4, :cond_24

    .line 66
    invoke-virtual {v9}, Lv/c;->c()I

    move-result v9

    add-int v34, v9, v34

    :cond_24
    move/from16 v9, v34

    if-eqz v36, :cond_25

    if-eq v6, v4, :cond_25

    if-eq v6, v11, :cond_25

    const/16 v30, 0x5

    :cond_25
    move-object/from16 v34, v4

    .line 67
    iget-object v4, v7, Lv/c;->d:Lv/c;

    if-eqz v4, :cond_28

    if-ne v6, v11, :cond_26

    move/from16 v37, v8

    .line 68
    iget-object v8, v7, Lv/c;->g:Lu/i;

    iget-object v4, v4, Lv/c;->g:Lu/i;

    move/from16 v38, v12

    const/4 v12, 0x6

    invoke-virtual {v1, v8, v4, v9, v12}, Lu/e;->f(Lu/i;Lu/i;II)V

    goto :goto_1d

    :cond_26
    move/from16 v37, v8

    move/from16 v38, v12

    .line 69
    iget-object v8, v7, Lv/c;->g:Lu/i;

    iget-object v4, v4, Lv/c;->g:Lu/i;

    const/16 v12, 0x8

    invoke-virtual {v1, v8, v4, v9, v12}, Lu/e;->f(Lu/i;Lu/i;II)V

    :goto_1d
    if-eqz v37, :cond_27

    if-nez v36, :cond_27

    const/4 v4, 0x5

    goto :goto_1e

    :cond_27
    move/from16 v4, v30

    .line 70
    :goto_1e
    iget-object v8, v7, Lv/c;->g:Lu/i;

    iget-object v7, v7, Lv/c;->d:Lv/c;

    iget-object v7, v7, Lv/c;->g:Lu/i;

    invoke-virtual {v1, v8, v7, v9, v4}, Lu/e;->e(Lu/i;Lu/i;II)V

    goto :goto_1f

    :cond_28
    move/from16 v38, v12

    :goto_1f
    if-eqz v28, :cond_2a

    .line 71
    iget v4, v6, Lv/d;->V:I

    const/16 v12, 0x8

    if-eq v4, v12, :cond_29

    .line 72
    aget v4, v33, p2

    const/4 v9, 0x3

    if-ne v4, v9, :cond_29

    add-int/lit8 v4, v14, 0x1

    .line 73
    aget-object v4, v32, v4

    iget-object v4, v4, Lv/c;->g:Lu/i;

    aget-object v7, v32, v14

    iget-object v7, v7, Lv/c;->g:Lu/i;

    const/4 v8, 0x0

    const/4 v9, 0x5

    invoke-virtual {v1, v4, v7, v8, v9}, Lu/e;->f(Lu/i;Lu/i;II)V

    goto :goto_20

    :cond_29
    const/4 v8, 0x0

    .line 74
    :goto_20
    aget-object v4, v32, v14

    iget-object v4, v4, Lv/c;->g:Lu/i;

    aget-object v7, v35, v14

    iget-object v7, v7, Lv/c;->g:Lu/i;

    const/16 v12, 0x8

    invoke-virtual {v1, v4, v7, v8, v12}, Lu/e;->f(Lu/i;Lu/i;II)V

    :cond_2a
    add-int/lit8 v4, v14, 0x1

    .line 75
    aget-object v4, v32, v4

    iget-object v4, v4, Lv/c;->d:Lv/c;

    if-eqz v4, :cond_2b

    .line 76
    iget-object v4, v4, Lv/c;->b:Lv/d;

    .line 77
    iget-object v7, v4, Lv/d;->F:[Lv/c;

    aget-object v7, v7, v14

    iget-object v7, v7, Lv/c;->d:Lv/c;

    if-eqz v7, :cond_2b

    iget-object v7, v7, Lv/c;->b:Lv/d;

    if-eq v7, v6, :cond_2c

    :cond_2b
    move-object/from16 v4, v16

    :cond_2c
    if-eqz v4, :cond_2d

    move-object v6, v4

    goto :goto_21

    :cond_2d
    const/16 v22, 0x1

    :goto_21
    move-object/from16 v4, v34

    move-object/from16 v8, v35

    move/from16 v9, v36

    move/from16 v12, v38

    goto/16 :goto_1a

    :cond_2e
    move-object/from16 v35, v8

    move/from16 v36, v9

    move/from16 v38, v12

    if-eqz v3, :cond_31

    .line 78
    iget-object v4, v10, Lv/d;->F:[Lv/c;

    add-int/lit8 v6, v14, 0x1

    aget-object v4, v4, v6

    iget-object v4, v4, Lv/c;->d:Lv/c;

    if-eqz v4, :cond_31

    .line 79
    iget-object v4, v3, Lv/d;->F:[Lv/c;

    aget-object v4, v4, v6

    .line 80
    iget-object v7, v3, Lv/d;->c0:[I

    aget v7, v7, p2

    const/4 v9, 0x3

    if-ne v7, v9, :cond_2f

    iget-object v7, v3, Lv/d;->l:[I

    aget v7, v7, p2

    if-nez v7, :cond_2f

    if-nez v36, :cond_2f

    .line 81
    iget-object v7, v4, Lv/c;->d:Lv/c;

    iget-object v8, v7, Lv/c;->b:Lv/d;

    if-ne v8, v0, :cond_2f

    .line 82
    iget-object v8, v4, Lv/c;->g:Lu/i;

    iget-object v7, v7, Lv/c;->g:Lu/i;

    invoke-virtual {v4}, Lv/c;->c()I

    move-result v9

    neg-int v9, v9

    const/4 v12, 0x5

    invoke-virtual {v1, v8, v7, v9, v12}, Lu/e;->e(Lu/i;Lu/i;II)V

    goto :goto_22

    :cond_2f
    const/4 v12, 0x5

    if-eqz v36, :cond_30

    .line 83
    iget-object v7, v4, Lv/c;->d:Lv/c;

    iget-object v8, v7, Lv/c;->b:Lv/d;

    if-ne v8, v0, :cond_30

    .line 84
    iget-object v8, v4, Lv/c;->g:Lu/i;

    iget-object v7, v7, Lv/c;->g:Lu/i;

    invoke-virtual {v4}, Lv/c;->c()I

    move-result v9

    neg-int v9, v9

    const/4 v12, 0x4

    invoke-virtual {v1, v8, v7, v9, v12}, Lu/e;->e(Lu/i;Lu/i;II)V

    .line 85
    :cond_30
    :goto_22
    iget-object v7, v4, Lv/c;->g:Lu/i;

    iget-object v8, v10, Lv/d;->F:[Lv/c;

    aget-object v6, v8, v6

    iget-object v6, v6, Lv/c;->d:Lv/c;

    iget-object v6, v6, Lv/c;->g:Lu/i;

    .line 86
    invoke-virtual {v4}, Lv/c;->c()I

    move-result v4

    neg-int v4, v4

    const/4 v12, 0x6

    .line 87
    invoke-virtual {v1, v7, v6, v4, v12}, Lu/e;->g(Lu/i;Lu/i;II)V

    :cond_31
    if-eqz v28, :cond_32

    add-int/lit8 v4, v14, 0x1

    .line 88
    aget-object v6, v35, v4

    iget-object v6, v6, Lv/c;->g:Lu/i;

    iget-object v7, v10, Lv/d;->F:[Lv/c;

    aget-object v4, v7, v4

    iget-object v7, v4, Lv/c;->g:Lu/i;

    .line 89
    invoke-virtual {v4}, Lv/c;->c()I

    move-result v4

    const/16 v12, 0x8

    .line 90
    invoke-virtual {v1, v6, v7, v4, v12}, Lu/e;->f(Lu/i;Lu/i;II)V

    .line 91
    :cond_32
    iget-object v4, v2, Lv/b;->h:Ljava/util/ArrayList;

    if-eqz v4, :cond_3c

    .line 92
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x1

    if-le v6, v7, :cond_3c

    .line 93
    iget-boolean v8, v2, Lv/b;->n:Z

    if-eqz v8, :cond_33

    iget-boolean v8, v2, Lv/b;->p:Z

    if-nez v8, :cond_33

    .line 94
    iget v8, v2, Lv/b;->j:I

    int-to-float v8, v8

    move/from16 v17, v8

    :cond_33
    move-object/from16 v9, v16

    const/4 v8, 0x0

    const/4 v12, 0x0

    :goto_23
    if-ge v8, v6, :cond_3c

    .line 95
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v7, v21

    check-cast v7, Lv/d;

    .line 96
    iget-object v0, v7, Lv/d;->Z:[F

    move-object/from16 v21, v0

    iget-object v0, v7, Lv/d;->F:[Lv/c;

    aget v21, v21, p2

    move-object/from16 v24, v0

    cmpg-float v28, v21, v19

    if-gez v28, :cond_35

    .line 97
    iget-boolean v0, v2, Lv/b;->p:Z

    if-eqz v0, :cond_34

    add-int/lit8 v0, v14, 0x1

    .line 98
    aget-object v0, v24, v0

    iget-object v0, v0, Lv/c;->g:Lu/i;

    aget-object v7, v24, v14

    iget-object v7, v7, Lv/c;->g:Lu/i;

    move-object/from16 v29, v4

    move/from16 v30, v6

    const/4 v4, 0x0

    const/4 v6, 0x4

    invoke-virtual {v1, v0, v7, v4, v6}, Lu/e;->e(Lu/i;Lu/i;II)V

    move/from16 v20, v12

    const/4 v12, 0x0

    goto :goto_24

    :cond_34
    const/high16 v21, 0x3f800000    # 1.0f

    :cond_35
    move-object/from16 v29, v4

    move/from16 v30, v6

    const/4 v6, 0x4

    cmpl-float v0, v21, v19

    if-nez v0, :cond_36

    add-int/lit8 v0, v14, 0x1

    .line 99
    aget-object v0, v24, v0

    iget-object v0, v0, Lv/c;->g:Lu/i;

    aget-object v4, v24, v14

    iget-object v4, v4, Lv/c;->g:Lu/i;

    move/from16 v20, v12

    const/16 v7, 0x8

    const/4 v12, 0x0

    invoke-virtual {v1, v0, v4, v12, v7}, Lu/e;->e(Lu/i;Lu/i;II)V

    :goto_24
    move/from16 v28, v8

    move/from16 v12, v20

    move-object/from16 v20, v13

    goto/16 :goto_29

    :cond_36
    move/from16 v20, v12

    const/4 v12, 0x0

    if-eqz v9, :cond_3b

    .line 100
    iget-object v4, v9, Lv/d;->F:[Lv/c;

    aget-object v9, v4, v14

    iget-object v9, v9, Lv/c;->g:Lu/i;

    add-int/lit8 v32, v14, 0x1

    .line 101
    aget-object v4, v4, v32

    iget-object v4, v4, Lv/c;->g:Lu/i;

    .line 102
    aget-object v6, v24, v14

    iget-object v6, v6, Lv/c;->g:Lu/i;

    .line 103
    aget-object v12, v24, v32

    iget-object v12, v12, Lv/c;->g:Lu/i;

    move/from16 v24, v0

    .line 104
    invoke-virtual {v1}, Lu/e;->k()Lu/c;

    move-result-object v0

    move-object/from16 v32, v7

    const/4 v7, 0x0

    .line 105
    iput v7, v0, Lu/c;->b:F

    const/16 v19, 0x0

    const/high16 v7, -0x40800000    # -1.0f

    cmpl-float v35, v17, v19

    if-eqz v35, :cond_37

    cmpl-float v35, v20, v21

    if-nez v35, :cond_38

    :cond_37
    move/from16 v28, v8

    move-object/from16 v20, v13

    const/high16 v7, 0x3f800000    # 1.0f

    const/high16 v13, -0x40800000    # -1.0f

    goto :goto_26

    :cond_38
    cmpl-float v35, v20, v19

    if-nez v35, :cond_39

    .line 106
    iget-object v6, v0, Lu/c;->d:Lu/b;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-interface {v6, v9, v12}, Lu/b;->h(Lu/i;F)V

    .line 107
    iget-object v6, v0, Lu/c;->d:Lu/b;

    invoke-interface {v6, v4, v7}, Lu/b;->h(Lu/i;F)V

    :goto_25
    move/from16 v28, v8

    move-object/from16 v20, v13

    goto :goto_27

    :cond_39
    const/high16 v7, 0x3f800000    # 1.0f

    if-nez v24, :cond_3a

    .line 108
    iget-object v4, v0, Lu/c;->d:Lu/b;

    invoke-interface {v4, v6, v7}, Lu/b;->h(Lu/i;F)V

    .line 109
    iget-object v4, v0, Lu/c;->d:Lu/b;

    const/high16 v6, -0x40800000    # -1.0f

    invoke-interface {v4, v12, v6}, Lu/b;->h(Lu/i;F)V

    goto :goto_25

    :cond_3a
    div-float v20, v20, v17

    div-float v24, v21, v17

    move/from16 v28, v8

    div-float v8, v20, v24

    move-object/from16 v20, v13

    .line 110
    iget-object v13, v0, Lu/c;->d:Lu/b;

    invoke-interface {v13, v9, v7}, Lu/b;->h(Lu/i;F)V

    .line 111
    iget-object v7, v0, Lu/c;->d:Lu/b;

    const/high16 v13, -0x40800000    # -1.0f

    invoke-interface {v7, v4, v13}, Lu/b;->h(Lu/i;F)V

    .line 112
    iget-object v4, v0, Lu/c;->d:Lu/b;

    invoke-interface {v4, v12, v8}, Lu/b;->h(Lu/i;F)V

    .line 113
    iget-object v4, v0, Lu/c;->d:Lu/b;

    neg-float v7, v8

    invoke-interface {v4, v6, v7}, Lu/b;->h(Lu/i;F)V

    goto :goto_27

    .line 114
    :goto_26
    iget-object v8, v0, Lu/c;->d:Lu/b;

    invoke-interface {v8, v9, v7}, Lu/b;->h(Lu/i;F)V

    .line 115
    iget-object v8, v0, Lu/c;->d:Lu/b;

    invoke-interface {v8, v4, v13}, Lu/b;->h(Lu/i;F)V

    .line 116
    iget-object v4, v0, Lu/c;->d:Lu/b;

    invoke-interface {v4, v12, v7}, Lu/b;->h(Lu/i;F)V

    .line 117
    iget-object v4, v0, Lu/c;->d:Lu/b;

    invoke-interface {v4, v6, v13}, Lu/b;->h(Lu/i;F)V

    .line 118
    :goto_27
    invoke-virtual {v1, v0}, Lu/e;->c(Lu/c;)V

    goto :goto_28

    :cond_3b
    move-object/from16 v32, v7

    move/from16 v28, v8

    move-object/from16 v20, v13

    :goto_28
    move/from16 v12, v21

    move-object/from16 v9, v32

    :goto_29
    add-int/lit8 v8, v28, 0x1

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move-object/from16 v13, v20

    move-object/from16 v4, v29

    move/from16 v6, v30

    goto/16 :goto_23

    :cond_3c
    move-object/from16 v20, v13

    if-eqz v11, :cond_3d

    if-eq v11, v3, :cond_3e

    if-eqz v36, :cond_3d

    goto :goto_2a

    :cond_3d
    move-object v0, v3

    const/16 v27, 0x2

    goto :goto_2f

    .line 119
    :cond_3e
    :goto_2a
    aget-object v0, v26, v14

    .line 120
    iget-object v2, v10, Lv/d;->F:[Lv/c;

    add-int/lit8 v4, v14, 0x1

    aget-object v2, v2, v4

    .line 121
    iget-object v0, v0, Lv/c;->d:Lv/c;

    if-eqz v0, :cond_3f

    iget-object v0, v0, Lv/c;->g:Lu/i;

    goto :goto_2b

    :cond_3f
    move-object/from16 v0, v16

    .line 122
    :goto_2b
    iget-object v2, v2, Lv/c;->d:Lv/c;

    if-eqz v2, :cond_40

    iget-object v2, v2, Lv/c;->g:Lu/i;

    move-object v6, v2

    goto :goto_2c

    :cond_40
    move-object/from16 v6, v16

    .line 123
    :goto_2c
    iget-object v2, v11, Lv/d;->F:[Lv/c;

    aget-object v2, v2, v14

    .line 124
    iget-object v7, v3, Lv/d;->F:[Lv/c;

    aget-object v4, v7, v4

    if-eqz v0, :cond_42

    if-eqz v6, :cond_42

    if-nez p2, :cond_41

    .line 125
    iget v5, v5, Lv/d;->S:F

    goto :goto_2d

    .line 126
    :cond_41
    iget v5, v5, Lv/d;->T:F

    .line 127
    :goto_2d
    invoke-virtual {v2}, Lv/c;->c()I

    move-result v7

    .line 128
    invoke-virtual {v4}, Lv/c;->c()I

    move-result v8

    .line 129
    iget-object v2, v2, Lv/c;->g:Lu/i;

    iget-object v4, v4, Lv/c;->g:Lu/i;

    const/4 v9, 0x7

    move-object/from16 v27, v3

    move-object v3, v0

    move-object/from16 v0, v27

    move/from16 v27, v7

    move-object v7, v4

    move/from16 v4, v27

    const/16 v27, 0x2

    invoke-virtual/range {v1 .. v9}, Lu/e;->b(Lu/i;Lu/i;IFLu/i;Lu/i;II)V

    goto :goto_2e

    :cond_42
    move-object v0, v3

    const/16 v27, 0x2

    :cond_43
    :goto_2e
    move-object/from16 v1, p1

    goto/16 :goto_44

    :goto_2f
    if-eqz v25, :cond_55

    if-eqz v11, :cond_55

    .line 130
    iget v1, v2, Lv/b;->j:I

    if-lez v1, :cond_44

    iget v2, v2, Lv/b;->i:I

    if-ne v2, v1, :cond_44

    const/16 v22, 0x1

    goto :goto_30

    :cond_44
    const/16 v22, 0x0

    :goto_30
    move-object v12, v11

    move-object v13, v12

    :goto_31
    if-eqz v12, :cond_43

    .line 131
    iget-object v1, v12, Lv/d;->F:[Lv/c;

    .line 132
    iget-object v2, v12, Lv/d;->b0:[Lv/d;

    aget-object v2, v2, p2

    :goto_32
    if-eqz v2, :cond_45

    .line 133
    iget v3, v2, Lv/d;->V:I

    const/16 v5, 0x8

    if-ne v3, v5, :cond_46

    .line 134
    iget-object v2, v2, Lv/d;->b0:[Lv/d;

    aget-object v2, v2, p2

    goto :goto_32

    :cond_45
    const/16 v5, 0x8

    :cond_46
    if-nez v2, :cond_48

    if-ne v12, v0, :cond_47

    goto :goto_33

    :cond_47
    move-object/from16 v17, v2

    move-object/from16 v19, v13

    const/16 v13, 0x8

    const/16 v31, 0x5

    goto/16 :goto_3a

    .line 135
    :cond_48
    :goto_33
    aget-object v3, v1, v14

    .line 136
    iget-object v4, v3, Lv/c;->g:Lu/i;

    .line 137
    iget-object v6, v3, Lv/c;->d:Lv/c;

    if-eqz v6, :cond_49

    iget-object v6, v6, Lv/c;->g:Lu/i;

    goto :goto_34

    :cond_49
    move-object/from16 v6, v16

    :goto_34
    if-eq v13, v12, :cond_4a

    .line 138
    iget-object v6, v13, Lv/d;->F:[Lv/c;

    add-int/lit8 v7, v14, 0x1

    aget-object v6, v6, v7

    iget-object v6, v6, Lv/c;->g:Lu/i;

    goto :goto_35

    :cond_4a
    if-ne v12, v11, :cond_4c

    if-ne v13, v12, :cond_4c

    .line 139
    aget-object v6, v26, v14

    iget-object v6, v6, Lv/c;->d:Lv/c;

    if-eqz v6, :cond_4b

    iget-object v6, v6, Lv/c;->g:Lu/i;

    goto :goto_35

    :cond_4b
    move-object/from16 v6, v16

    .line 140
    :cond_4c
    :goto_35
    invoke-virtual {v3}, Lv/c;->c()I

    move-result v3

    add-int/lit8 v7, v14, 0x1

    .line 141
    aget-object v8, v1, v7

    invoke-virtual {v8}, Lv/c;->c()I

    move-result v8

    if-eqz v2, :cond_4d

    .line 142
    iget-object v9, v2, Lv/d;->F:[Lv/c;

    aget-object v9, v9, v14

    .line 143
    iget-object v5, v9, Lv/c;->g:Lu/i;

    .line 144
    aget-object v1, v1, v7

    iget-object v1, v1, Lv/c;->g:Lu/i;

    goto :goto_37

    .line 145
    :cond_4d
    iget-object v5, v10, Lv/d;->F:[Lv/c;

    aget-object v5, v5, v7

    iget-object v9, v5, Lv/c;->d:Lv/c;

    if-eqz v9, :cond_4e

    .line 146
    iget-object v5, v9, Lv/c;->g:Lu/i;

    goto :goto_36

    :cond_4e
    move-object/from16 v5, v16

    .line 147
    :goto_36
    aget-object v1, v1, v7

    iget-object v1, v1, Lv/c;->g:Lu/i;

    :goto_37
    if-eqz v9, :cond_4f

    .line 148
    invoke-virtual {v9}, Lv/c;->c()I

    move-result v9

    add-int/2addr v8, v9

    :cond_4f
    if-eqz v13, :cond_50

    .line 149
    iget-object v9, v13, Lv/d;->F:[Lv/c;

    aget-object v9, v9, v7

    invoke-virtual {v9}, Lv/c;->c()I

    move-result v9

    add-int/2addr v3, v9

    :cond_50
    if-eqz v4, :cond_47

    if-eqz v6, :cond_47

    if-eqz v5, :cond_47

    if-eqz v1, :cond_47

    if-ne v12, v11, :cond_51

    .line 150
    iget-object v3, v11, Lv/d;->F:[Lv/c;

    aget-object v3, v3, v14

    invoke-virtual {v3}, Lv/c;->c()I

    move-result v3

    :cond_51
    if-ne v12, v0, :cond_52

    .line 151
    iget-object v8, v0, Lv/d;->F:[Lv/c;

    aget-object v7, v8, v7

    invoke-virtual {v7}, Lv/c;->c()I

    move-result v8

    :cond_52
    if-eqz v22, :cond_53

    const/16 v9, 0x8

    :goto_38
    move-object v7, v2

    move-object v2, v4

    move v4, v3

    move-object v3, v6

    move-object v6, v5

    goto :goto_39

    :cond_53
    const/4 v9, 0x5

    goto :goto_38

    :goto_39
    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v17, v7

    move-object/from16 v19, v13

    const/16 v13, 0x8

    const/16 v31, 0x5

    move-object v7, v1

    move-object/from16 v1, p1

    .line 152
    invoke-virtual/range {v1 .. v9}, Lu/e;->b(Lu/i;Lu/i;IFLu/i;Lu/i;II)V

    .line 153
    :goto_3a
    iget v1, v12, Lv/d;->V:I

    if-eq v1, v13, :cond_54

    move-object/from16 v19, v12

    :cond_54
    move-object/from16 v12, v17

    move-object/from16 v13, v19

    goto/16 :goto_31

    :cond_55
    const/16 v13, 0x8

    if-eqz v18, :cond_43

    if-eqz v11, :cond_43

    .line 154
    iget v1, v2, Lv/b;->j:I

    if-lez v1, :cond_56

    iget v2, v2, Lv/b;->i:I

    if-ne v2, v1, :cond_56

    const/16 v22, 0x1

    goto :goto_3b

    :cond_56
    const/16 v22, 0x0

    :goto_3b
    move-object v1, v11

    move-object v12, v1

    :goto_3c
    if-eqz v12, :cond_61

    .line 155
    iget-object v2, v12, Lv/d;->F:[Lv/c;

    .line 156
    iget-object v3, v12, Lv/d;->b0:[Lv/d;

    aget-object v3, v3, p2

    :goto_3d
    if-eqz v3, :cond_57

    .line 157
    iget v4, v3, Lv/d;->V:I

    if-ne v4, v13, :cond_57

    .line 158
    iget-object v3, v3, Lv/d;->b0:[Lv/d;

    aget-object v3, v3, p2

    goto :goto_3d

    :cond_57
    if-eq v12, v11, :cond_5f

    if-eq v12, v0, :cond_5f

    if-eqz v3, :cond_5f

    if-ne v3, v0, :cond_58

    move-object/from16 v3, v16

    .line 159
    :cond_58
    aget-object v4, v2, v14

    move-object v5, v2

    .line 160
    iget-object v2, v4, Lv/c;->g:Lu/i;

    .line 161
    iget-object v6, v1, Lv/d;->F:[Lv/c;

    add-int/lit8 v7, v14, 0x1

    aget-object v6, v6, v7

    iget-object v6, v6, Lv/c;->g:Lu/i;

    .line 162
    invoke-virtual {v4}, Lv/c;->c()I

    move-result v4

    .line 163
    aget-object v8, v5, v7

    invoke-virtual {v8}, Lv/c;->c()I

    move-result v8

    if-eqz v3, :cond_5a

    .line 164
    iget-object v5, v3, Lv/d;->F:[Lv/c;

    aget-object v5, v5, v14

    .line 165
    iget-object v9, v5, Lv/c;->g:Lu/i;

    .line 166
    iget-object v13, v5, Lv/c;->d:Lv/c;

    if-eqz v13, :cond_59

    iget-object v13, v13, Lv/c;->g:Lu/i;

    goto :goto_3f

    :cond_59
    move-object/from16 v13, v16

    goto :goto_3f

    .line 167
    :cond_5a
    iget-object v9, v0, Lv/d;->F:[Lv/c;

    aget-object v9, v9, v14

    if-eqz v9, :cond_5b

    .line 168
    iget-object v13, v9, Lv/c;->g:Lu/i;

    goto :goto_3e

    :cond_5b
    move-object/from16 v13, v16

    .line 169
    :goto_3e
    aget-object v5, v5, v7

    iget-object v5, v5, Lv/c;->g:Lu/i;

    move-object/from16 v39, v13

    move-object v13, v5

    move-object v5, v9

    move-object/from16 v9, v39

    :goto_3f
    if-eqz v5, :cond_5c

    .line 170
    invoke-virtual {v5}, Lv/c;->c()I

    move-result v5

    add-int/2addr v8, v5

    .line 171
    :cond_5c
    iget-object v5, v1, Lv/d;->F:[Lv/c;

    aget-object v5, v5, v7

    invoke-virtual {v5}, Lv/c;->c()I

    move-result v5

    add-int/2addr v4, v5

    if-eqz v22, :cond_5d

    const/16 v7, 0x8

    goto :goto_40

    :cond_5d
    const/4 v7, 0x4

    :goto_40
    if-eqz v2, :cond_5e

    if-eqz v6, :cond_5e

    if-eqz v9, :cond_5e

    if-eqz v13, :cond_5e

    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v17, v3

    move-object v3, v6

    move-object v6, v9

    const/16 v30, 0x4

    move v9, v7

    move-object v7, v13

    move-object v13, v1

    move-object/from16 v1, p1

    .line 172
    invoke-virtual/range {v1 .. v9}, Lu/e;->b(Lu/i;Lu/i;IFLu/i;Lu/i;II)V

    goto :goto_41

    :cond_5e
    move-object v13, v1

    move-object/from16 v17, v3

    const/16 v30, 0x4

    move-object/from16 v1, p1

    :goto_41
    move-object/from16 v3, v17

    goto :goto_42

    :cond_5f
    move-object v13, v1

    const/16 v30, 0x4

    move-object/from16 v1, p1

    .line 173
    :goto_42
    iget v2, v12, Lv/d;->V:I

    const/16 v5, 0x8

    if-eq v2, v5, :cond_60

    move-object v13, v12

    :cond_60
    move-object v12, v3

    move-object v1, v13

    const/16 v13, 0x8

    goto/16 :goto_3c

    :cond_61
    move-object/from16 v1, p1

    .line 174
    iget-object v2, v11, Lv/d;->F:[Lv/c;

    aget-object v2, v2, v14

    .line 175
    aget-object v3, v26, v14

    iget-object v3, v3, Lv/c;->d:Lv/c;

    .line 176
    iget-object v4, v0, Lv/d;->F:[Lv/c;

    add-int/lit8 v5, v14, 0x1

    aget-object v12, v4, v5

    .line 177
    iget-object v4, v10, Lv/d;->F:[Lv/c;

    aget-object v4, v4, v5

    iget-object v13, v4, Lv/c;->d:Lv/c;

    const/4 v9, 0x5

    if-eqz v3, :cond_63

    if-eq v11, v0, :cond_62

    .line 178
    iget-object v4, v2, Lv/c;->g:Lu/i;

    iget-object v3, v3, Lv/c;->g:Lu/i;

    invoke-virtual {v2}, Lv/c;->c()I

    move-result v2

    invoke-virtual {v1, v4, v3, v2, v9}, Lu/e;->e(Lu/i;Lu/i;II)V

    goto :goto_43

    :cond_62
    if-eqz v13, :cond_63

    move-object v4, v2

    .line 179
    iget-object v2, v4, Lv/c;->g:Lu/i;

    iget-object v3, v3, Lv/c;->g:Lu/i;

    invoke-virtual {v4}, Lv/c;->c()I

    move-result v4

    iget-object v6, v12, Lv/c;->g:Lu/i;

    iget-object v7, v13, Lv/c;->g:Lu/i;

    .line 180
    invoke-virtual {v12}, Lv/c;->c()I

    move-result v8

    const/high16 v5, 0x3f000000    # 0.5f

    .line 181
    invoke-virtual/range {v1 .. v9}, Lu/e;->b(Lu/i;Lu/i;IFLu/i;Lu/i;II)V

    :cond_63
    :goto_43
    if-eqz v13, :cond_64

    if-eq v11, v0, :cond_64

    .line 182
    iget-object v2, v12, Lv/c;->g:Lu/i;

    iget-object v3, v13, Lv/c;->g:Lu/i;

    invoke-virtual {v12}, Lv/c;->c()I

    move-result v4

    neg-int v4, v4

    invoke-virtual {v1, v2, v3, v4, v9}, Lu/e;->e(Lu/i;Lu/i;II)V

    :cond_64
    :goto_44
    if-nez v25, :cond_65

    if-eqz v18, :cond_6b

    :cond_65
    if-eqz v11, :cond_6b

    if-eq v11, v0, :cond_6b

    .line 183
    iget-object v2, v11, Lv/d;->F:[Lv/c;

    aget-object v3, v2, v14

    .line 184
    iget-object v4, v0, Lv/d;->F:[Lv/c;

    add-int/lit8 v5, v14, 0x1

    aget-object v4, v4, v5

    .line 185
    iget-object v6, v3, Lv/c;->d:Lv/c;

    if-eqz v6, :cond_66

    iget-object v6, v6, Lv/c;->g:Lu/i;

    goto :goto_45

    :cond_66
    move-object/from16 v6, v16

    .line 186
    :goto_45
    iget-object v7, v4, Lv/c;->d:Lv/c;

    if-eqz v7, :cond_67

    iget-object v7, v7, Lv/c;->g:Lu/i;

    goto :goto_46

    :cond_67
    move-object/from16 v7, v16

    :goto_46
    if-eq v10, v0, :cond_69

    .line 187
    iget-object v7, v10, Lv/d;->F:[Lv/c;

    aget-object v7, v7, v5

    .line 188
    iget-object v7, v7, Lv/c;->d:Lv/c;

    if-eqz v7, :cond_68

    iget-object v7, v7, Lv/c;->g:Lu/i;

    move-object/from16 v16, v7

    :cond_68
    move-object/from16 v7, v16

    :cond_69
    if-ne v11, v0, :cond_6a

    .line 189
    aget-object v4, v2, v5

    :cond_6a
    if-eqz v6, :cond_6b

    if-eqz v7, :cond_6b

    .line 190
    invoke-virtual {v3}, Lv/c;->c()I

    move-result v2

    .line 191
    iget-object v0, v0, Lv/d;->F:[Lv/c;

    aget-object v0, v0, v5

    invoke-virtual {v0}, Lv/c;->c()I

    move-result v8

    .line 192
    iget-object v0, v3, Lv/c;->g:Lu/i;

    iget-object v3, v4, Lv/c;->g:Lu/i;

    const/4 v9, 0x5

    const/high16 v5, 0x3f000000    # 0.5f

    move-object v4, v7

    move-object v7, v3

    move-object v3, v6

    move-object v6, v4

    move v4, v2

    move-object v2, v0

    invoke-virtual/range {v1 .. v9}, Lu/e;->b(Lu/i;Lu/i;IFLu/i;Lu/i;II)V

    :cond_6b
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, v20

    move/from16 v12, v38

    goto/16 :goto_2

    :cond_6c
    return-void
.end method
