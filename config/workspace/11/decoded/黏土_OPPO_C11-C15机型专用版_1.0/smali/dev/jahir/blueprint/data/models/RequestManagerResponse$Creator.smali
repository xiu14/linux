.class public final Ldev/jahir/blueprint/data/models/RequestManagerResponse$Creator;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldev/jahir/blueprint/data/models/RequestManagerResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Ldev/jahir/blueprint/data/models/RequestManagerResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ldev/jahir/blueprint/data/models/RequestManagerResponse;
    .locals 2

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldev/jahir/blueprint/data/models/RequestManagerResponse;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ldev/jahir/blueprint/data/models/RequestManagerResponse;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/data/models/RequestManagerResponse$Creator;->createFromParcel(Landroid/os/Parcel;)Ldev/jahir/blueprint/data/models/RequestManagerResponse;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Ldev/jahir/blueprint/data/models/RequestManagerResponse;
    .locals 0

    .line 1
    new-array p1, p1, [Ldev/jahir/blueprint/data/models/RequestManagerResponse;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Ldev/jahir/blueprint/data/models/RequestManagerResponse$Creator;->newArray(I)[Ldev/jahir/blueprint/data/models/RequestManagerResponse;

    move-result-object p1

    return-object p1
.end method
