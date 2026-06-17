.class Lcom/google/android/material/slider/BaseSlider$SliderState;
.super Landroid/view/View$BaseSavedState;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/slider/BaseSlider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SliderState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/material/slider/BaseSlider$SliderState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:F

.field public i:F

.field public j:Ljava/util/ArrayList;

.field public k:F

.field public l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/material/slider/BaseSlider$SliderState$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/material/slider/BaseSlider$SliderState$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/material/slider/BaseSlider$SliderState;->CREATOR:Landroid/os/Parcelable$Creator;

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
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->h:F

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 7
    .line 8
    .line 9
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->i:F

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->j:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iget p2, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->k:F

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 22
    .line 23
    .line 24
    iget-boolean p2, p0, Lcom/google/android/material/slider/BaseSlider$SliderState;->l:Z

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    new-array v0, v0, [Z

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    aput-boolean p2, v0, v1

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBooleanArray([Z)V

    .line 33
    .line 34
    .line 35
    return-void
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
