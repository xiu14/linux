.class public final Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder$special$$inlined$findView$default$2;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder;-><init>(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld5/a;"
    }
.end annotation


# instance fields
.field final synthetic $id:I

.field final synthetic $logException:Z

.field final synthetic $this_findView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder$special$$inlined$findView$default$2;->$this_findView:Landroid/view/View;

    .line 2
    .line 3
    iput p2, p0, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder$special$$inlined$findView$default$2;->$id:I

    .line 4
    .line 5
    iput-boolean p3, p0, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder$special$$inlined$findView$default$2;->$logException:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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


# virtual methods
.method public final invoke()Landroid/view/View;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/widget/TextView;"
        }
    .end annotation

    .line 2
    :try_start_0
    iget-object v0, p0, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder$special$$inlined$findView$default$2;->$this_findView:Landroid/view/View;

    iget v1, p0, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder$special$$inlined$findView$default$2;->$id:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3
    iget-boolean v1, p0, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder$special$$inlined$findView$default$2;->$logException:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldev/jahir/blueprint/ui/viewholders/CounterViewHolder$special$$inlined$findView$default$2;->invoke()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
