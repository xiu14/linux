.class public final Ldev/jahir/blueprint/extensions/ParcelableKt$createParcel$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/blueprint/extensions/ParcelableKt;->createParcel(Ld5/l;)Landroid/os/Parcelable$Creator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic $createFromParcel:Ld5/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld5/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld5/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld5/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ldev/jahir/blueprint/extensions/ParcelableKt$createParcel$1;->$createFromParcel:Ld5/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Landroid/os/Parcelable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")TT;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Ldev/jahir/blueprint/extensions/ParcelableKt$createParcel$1;->$createFromParcel:Ld5/l;

    invoke-interface {v0, p1}, Ld5/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/extensions/ParcelableKt$createParcel$1;->createFromParcel(Landroid/os/Parcel;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Landroid/os/Parcelable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[TT;"
        }
    .end annotation

    .line 2
    invoke-static {}, Lkotlin/jvm/internal/j;->k()V

    const/4 p1, 0x0

    throw p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/extensions/ParcelableKt$createParcel$1;->newArray(I)[Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method
