.class public final Landroidx/appcompat/widget/h3;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/h3;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/appcompat/widget/h3;->i:Ljava/lang/Object;

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
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/h3;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/appcompat/widget/h3;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->T:Landroidx/appcompat/widget/e4;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p1, Landroidx/appcompat/widget/e4;->i:Ll/o;

    .line 17
    .line 18
    :goto_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ll/o;->collapseActionView()Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void

    .line 24
    :pswitch_0
    iget-object p1, p0, Landroidx/appcompat/widget/h3;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lk/b;

    .line 27
    .line 28
    invoke-virtual {p1}, Lk/b;->b()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, Landroidx/appcompat/widget/h3;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ldev/jahir/frames/ui/widgets/CleanSearchView;

    .line 35
    .line 36
    iget-object v1, v0, Landroidx/appcompat/widget/s3;->mSearchButton:Landroid/widget/ImageView;

    .line 37
    .line 38
    if-ne p1, v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/appcompat/widget/s3;->onSearchClicked()V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-object v1, v0, Landroidx/appcompat/widget/s3;->mCloseButton:Landroid/widget/ImageView;

    .line 45
    .line 46
    if-ne p1, v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/appcompat/widget/s3;->onCloseClicked()V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iget-object v1, v0, Landroidx/appcompat/widget/s3;->mGoButton:Landroid/widget/ImageView;

    .line 53
    .line 54
    if-ne p1, v1, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/appcompat/widget/s3;->onSubmitQuery()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    iget-object v1, v0, Landroidx/appcompat/widget/s3;->mVoiceButton:Landroid/widget/ImageView;

    .line 61
    .line 62
    if-ne p1, v1, :cond_5

    .line 63
    .line 64
    invoke-virtual {v0}, Landroidx/appcompat/widget/s3;->onVoiceClicked()V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    iget-object v1, v0, Landroidx/appcompat/widget/s3;->mSearchSrcTextView:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 69
    .line 70
    if-ne p1, v1, :cond_6

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/appcompat/widget/s3;->forceSuggestionQuery()V

    .line 73
    .line 74
    .line 75
    :cond_6
    :goto_1
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
