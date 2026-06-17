.class public Lcom/google/android/material/carousel/CarouselSnapHelper;
.super Landroidx/recyclerview/widget/m2;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/m2;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/google/android/material/carousel/CarouselSnapHelper;->c:Z

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
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/p1;Landroid/view/View;)[I
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    filled-new-array {v1, v1}, [I

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :cond_0
    move-object v0, p1

    .line 12
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {v0, p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->m(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    filled-new-array {p2, v1}, [I

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/p1;->canScrollVertically()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    filled-new-array {v1, p2}, [I

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :cond_2
    filled-new-array {v1, v1}, [I

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
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

.method public final b(Landroidx/recyclerview/widget/p1;)Landroidx/recyclerview/widget/d2;
    .locals 1

    .line 1
    instance-of p1, p1, Landroidx/recyclerview/widget/c2;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    return-object v0

    .line 7
    :cond_0
    throw v0
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

.method public final c(Landroidx/recyclerview/widget/p1;)Landroid/view/View;
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    instance-of v2, p1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    move-object v2, p1

    .line 14
    check-cast v2, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const v4, 0x7fffffff

    .line 18
    .line 19
    .line 20
    :goto_0
    if-ge v3, v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v2, v6}, Lcom/google/android/material/carousel/CarouselLayoutManager;->m(I)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-ge v6, v4, :cond_1

    .line 39
    .line 40
    move-object v1, v5

    .line 41
    move v4, v6

    .line 42
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-object v1
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
.end method

.method public final d(Landroidx/recyclerview/widget/p1;II)I
    .locals 12

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/carousel/CarouselSnapHelper;->c:Z

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/high16 v5, -0x80000000

    .line 23
    .line 24
    const v6, 0x7fffffff

    .line 25
    .line 26
    .line 27
    move-object v5, v3

    .line 28
    const/high16 v6, -0x80000000

    .line 29
    .line 30
    const v7, 0x7fffffff

    .line 31
    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    :goto_0
    if-ge v8, v2, :cond_5

    .line 35
    .line 36
    invoke-virtual {p1, v8}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    if-nez v9, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object v10, p1

    .line 44
    check-cast v10, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 45
    .line 46
    invoke-virtual {v10, v9}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    invoke-virtual {v10, v11}, Lcom/google/android/material/carousel/CarouselLayoutManager;->m(I)I

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    if-gtz v10, :cond_3

    .line 55
    .line 56
    if-le v10, v6, :cond_3

    .line 57
    .line 58
    move-object v5, v9

    .line 59
    move v6, v10

    .line 60
    :cond_3
    if-ltz v10, :cond_4

    .line 61
    .line 62
    if-ge v10, v7, :cond_4

    .line 63
    .line 64
    move-object v3, v9

    .line 65
    move v7, v10

    .line 66
    :cond_4
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/p1;->canScrollHorizontally()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    const/4 v6, 0x1

    .line 74
    if-eqz v2, :cond_7

    .line 75
    .line 76
    if-lez p2, :cond_6

    .line 77
    .line 78
    :goto_2
    const/4 p2, 0x1

    .line 79
    goto :goto_3

    .line 80
    :cond_6
    const/4 p2, 0x0

    .line 81
    goto :goto_3

    .line 82
    :cond_7
    if-lez p3, :cond_6

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :goto_3
    if-eqz p2, :cond_8

    .line 86
    .line 87
    if-eqz v3, :cond_8

    .line 88
    .line 89
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    return p1

    .line 94
    :cond_8
    if-nez p2, :cond_9

    .line 95
    .line 96
    if-eqz v5, :cond_9

    .line 97
    .line 98
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    return p1

    .line 103
    :cond_9
    if-eqz p2, :cond_a

    .line 104
    .line 105
    move-object v3, v5

    .line 106
    :cond_a
    if-nez v3, :cond_b

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_b
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    invoke-virtual {p1}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    instance-of v3, p1, Landroidx/recyclerview/widget/c2;

    .line 118
    .line 119
    if-eqz v3, :cond_d

    .line 120
    .line 121
    check-cast p1, Landroidx/recyclerview/widget/c2;

    .line 122
    .line 123
    sub-int/2addr v2, v6

    .line 124
    invoke-interface {p1, v2}, Landroidx/recyclerview/widget/c2;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_d

    .line 129
    .line 130
    iget v2, p1, Landroid/graphics/PointF;->x:F

    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    cmpg-float v2, v2, v3

    .line 134
    .line 135
    if-ltz v2, :cond_c

    .line 136
    .line 137
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 138
    .line 139
    cmpg-float p1, p1, v3

    .line 140
    .line 141
    if-gez p1, :cond_d

    .line 142
    .line 143
    :cond_c
    const/4 v4, 0x1

    .line 144
    :cond_d
    if-ne v4, p2, :cond_e

    .line 145
    .line 146
    const/4 v6, -0x1

    .line 147
    :cond_e
    add-int/2addr p3, v6

    .line 148
    if-ltz p3, :cond_10

    .line 149
    .line 150
    if-lt p3, v0, :cond_f

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_f
    return p3

    .line 154
    :cond_10
    :goto_4
    return v1
.end method
