.class public final Lcom/google/android/material/color/MaterialColorUtilitiesHelper;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/google/android/material/color/utilities/MaterialDynamicColors;

    invoke-direct {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;-><init>()V

    .line 2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 3
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_primary:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->d()Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_primary:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 5
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/4 v4, 0x2

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/4 v4, 0x3

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/b;

    const/4 v4, 0x4

    invoke-direct {v8, v4, v0}, Lcom/google/android/material/color/utilities/b;-><init>(ILjava/lang/Object;)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 6
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    const/4 v10, 0x0

    .line 7
    const-string v4, "on_primary"

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 8
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_primary_inverse:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 10
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/4 v4, 0x5

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/4 v4, 0x6

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/c;

    const/4 v4, 0x7

    invoke-direct {v8, v0, v4}, Lcom/google/android/material/color/utilities/c;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 11
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v4, "inverse_primary"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 13
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_primary_container:I

    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->e()Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v3

    .line 16
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_primary_container:I

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 19
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0xc

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0xe

    invoke-direct {v6, v0, v4}, Lcom/google/android/material/color/utilities/c;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V

    new-instance v8, Lcom/google/android/material/color/utilities/b;

    const/4 v4, 0x6

    invoke-direct {v8, v4, v0}, Lcom/google/android/material/color/utilities/b;-><init>(ILjava/lang/Object;)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 20
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v4, "on_primary_container"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 22
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_secondary:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->f()Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_secondary:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 25
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x18

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x19

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/b;

    const/16 v4, 0x8

    invoke-direct {v8, v4, v0}, Lcom/google/android/material/color/utilities/b;-><init>(ILjava/lang/Object;)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 26
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 27
    const-string v4, "on_secondary"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 28
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_secondary_container:I

    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 31
    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->g()Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v3

    .line 32
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_secondary_container:I

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 35
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/d;

    const/4 v4, 0x7

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x8

    invoke-direct {v6, v0, v4}, Lcom/google/android/material/color/utilities/d;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V

    new-instance v8, Lcom/google/android/material/color/utilities/b;

    const/16 v4, 0xc

    invoke-direct {v8, v4, v0}, Lcom/google/android/material/color/utilities/b;-><init>(ILjava/lang/Object;)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 36
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 37
    const-string v4, "on_secondary_container"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 38
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_tertiary:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->h()Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_tertiary:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 41
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0xd

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x17

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/b;

    const/16 v4, 0xa

    invoke-direct {v8, v4, v0}, Lcom/google/android/material/color/utilities/b;-><init>(ILjava/lang/Object;)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 42
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 43
    const-string v4, "on_tertiary"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 44
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_tertiary_container:I

    .line 46
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->i()Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v3

    .line 47
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_tertiary_container:I

    .line 49
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 50
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/d;

    const/4 v4, 0x5

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/d;

    const/4 v4, 0x6

    invoke-direct {v6, v0, v4}, Lcom/google/android/material/color/utilities/d;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V

    new-instance v8, Lcom/google/android/material/color/utilities/b;

    const/16 v4, 0xb

    invoke-direct {v8, v4, v0}, Lcom/google/android/material/color/utilities/b;-><init>(ILjava/lang/Object;)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 51
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 52
    const-string v4, "on_tertiary_container"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 53
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_background:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 55
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x14

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x15

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    const/4 v9, 0x0

    const-string v4, "background"

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 56
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_background:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 58
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x19

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x1a

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/a;

    invoke-direct {v8, v0}, Lcom/google/android/material/color/utilities/a;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 59
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 60
    const-string v4, "on_background"

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 61
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 63
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/a;

    const/4 v4, 0x0

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0xe

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    const/4 v9, 0x0

    const-string v4, "surface"

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 64
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_surface:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 66
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x9

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x13

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x1c

    invoke-direct {v8, v0, v4}, Lcom/google/android/material/color/utilities/d;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 67
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 68
    const-string v4, "on_surface"

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 69
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface_variant:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 71
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0xf

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x10

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    const/4 v9, 0x0

    const-string v4, "surface_variant"

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 72
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_surface_variant:I

    .line 74
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 75
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x10

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x11

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x1c

    invoke-direct {v8, v0, v4}, Lcom/google/android/material/color/utilities/d;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 76
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 77
    const-string v4, "on_surface_variant"

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 78
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface_inverse:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->c()Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_surface_inverse:I

    .line 81
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 82
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/d;

    const/4 v4, 0x2

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/d;

    const/4 v4, 0x3

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/d;

    const/4 v4, 0x4

    invoke-direct {v8, v0, v4}, Lcom/google/android/material/color/utilities/d;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 83
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 84
    const-string v4, "inverse_on_surface"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 85
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface_bright:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 87
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/4 v4, 0x0

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/4 v4, 0x1

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    const/4 v9, 0x0

    const-string v4, "surface_bright"

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 88
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface_dim:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 90
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/a;

    const/4 v4, 0x4

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/a;

    const/4 v4, 0x5

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    const-string v4, "surface_dim"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 91
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface_container:I

    .line 93
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 94
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0xe

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0xf

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    const-string v4, "surface_container"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 95
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface_container_low:I

    .line 97
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 98
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0xa

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0xb

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    const-string v4, "surface_container_low"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 99
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface_container_high:I

    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 102
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x16

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x18

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    const-string v4, "surface_container_high"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 103
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface_container_lowest:I

    .line 105
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 106
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x1c

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x1d

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    const-string v4, "surface_container_lowest"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 107
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_surface_container_highest:I

    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 110
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x13

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x14

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    const-string v4, "surface_container_highest"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 111
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_outline:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 113
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/d;

    const/4 v4, 0x0

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/d;

    const/4 v4, 0x1

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x1c

    invoke-direct {v8, v0, v4}, Lcom/google/android/material/color/utilities/d;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 114
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 115
    const-string v4, "outline"

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 116
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_outline_variant:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 118
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x1c

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x1d

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x1c

    invoke-direct {v8, v0, v4}, Lcom/google/android/material/color/utilities/d;-><init>(Lcom/google/android/material/color/utilities/MaterialDynamicColors;I)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 119
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 120
    const-string v4, "outline_variant"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 121
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_error:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->a()Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_error:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 124
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x8

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x9

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/b;

    const/4 v4, 0x5

    invoke-direct {v8, v4, v0}, Lcom/google/android/material/color/utilities/b;-><init>(ILjava/lang/Object;)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 125
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 126
    const-string v4, "on_error"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 127
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_error_container:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->b()Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    sget v2, Lcom/google/android/material/R$color;->material_personalized_color_on_error_container:I

    .line 130
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 131
    new-instance v3, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v5, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x15

    invoke-direct {v5, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v6, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x16

    invoke-direct {v6, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v8, Lcom/google/android/material/color/utilities/b;

    const/16 v4, 0xe

    invoke-direct {v8, v4, v0}, Lcom/google/android/material/color/utilities/b;-><init>(ILjava/lang/Object;)V

    new-instance v9, Lcom/google/android/material/color/utilities/ContrastCurve;

    .line 132
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 133
    const-string v4, "on_error_container"

    invoke-direct/range {v3 .. v10}, Lcom/google/android/material/color/utilities/DynamicColor;-><init>(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;ZLjava/util/function/Function;Lcom/google/android/material/color/utilities/ContrastCurve;Ljava/util/function/Function;)V

    .line 134
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    sget v0, Lcom/google/android/material/R$color;->material_personalized_color_control_activated:I

    .line 136
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 137
    new-instance v2, Lcom/google/android/material/color/utilities/a;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v3, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    const-string v4, "control_activated"

    invoke-static {v4, v2, v3}, Lcom/google/android/material/color/utilities/DynamicColor;->a(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v2

    .line 138
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    sget v0, Lcom/google/android/material/R$color;->material_personalized_color_control_normal:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 140
    new-instance v2, Lcom/google/android/material/color/utilities/a;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v3, Lcom/google/android/material/color/utilities/a;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    const-string v4, "control_normal"

    invoke-static {v4, v2, v3}, Lcom/google/android/material/color/utilities/DynamicColor;->a(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v2

    .line 141
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    sget v0, Lcom/google/android/material/R$color;->material_personalized_color_control_highlight:I

    .line 143
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 144
    new-instance v2, Lcom/google/android/material/color/utilities/DynamicColor;

    new-instance v3, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v3, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v3, Lcom/google/android/material/color/utilities/a;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    .line 145
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 146
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 147
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    sget v0, Lcom/google/android/material/R$color;->material_personalized_color_text_primary_inverse:I

    .line 149
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 150
    new-instance v2, Lcom/google/android/material/color/utilities/d;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v3, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    const-string v4, "text_primary_inverse"

    invoke-static {v4, v2, v3}, Lcom/google/android/material/color/utilities/DynamicColor;->a(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v2

    .line 151
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    sget v0, Lcom/google/android/material/R$color;->material_personalized_color_text_secondary_and_tertiary_inverse:I

    .line 153
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 154
    new-instance v2, Lcom/google/android/material/color/utilities/d;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    new-instance v3, Lcom/google/android/material/color/utilities/d;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/d;-><init>(I)V

    const-string v4, "text_secondary_and_tertiary_inverse"

    invoke-static {v4, v2, v3}, Lcom/google/android/material/color/utilities/DynamicColor;->a(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v2

    .line 155
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    sget v0, Lcom/google/android/material/R$color;->material_personalized_color_text_secondary_and_tertiary_inverse_disabled:I

    .line 157
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 158
    new-instance v2, Lcom/google/android/material/color/utilities/a;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lcom/google/android/material/color/utilities/a;-><init>(I)V

    new-instance v3, Lcom/google/android/material/color/utilities/c;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    const-string v4, "text_secondary_and_tertiary_inverse_disabled"

    invoke-static {v4, v2, v3}, Lcom/google/android/material/color/utilities/DynamicColor;->a(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v2

    .line 159
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    sget v0, Lcom/google/android/material/R$color;->material_personalized_color_text_primary_inverse_disable_only:I

    .line 161
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 162
    new-instance v2, Lcom/google/android/material/color/utilities/c;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v3, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    const-string v4, "text_primary_inverse_disable_only"

    invoke-static {v4, v2, v3}, Lcom/google/android/material/color/utilities/DynamicColor;->a(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v2

    .line 163
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    sget v0, Lcom/google/android/material/R$color;->material_personalized_color_text_hint_foreground_inverse:I

    .line 165
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 166
    new-instance v2, Lcom/google/android/material/color/utilities/c;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    new-instance v3, Lcom/google/android/material/color/utilities/c;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lcom/google/android/material/color/utilities/c;-><init>(I)V

    const-string v4, "text_hint_inverse"

    invoke-static {v4, v2, v3}, Lcom/google/android/material/color/utilities/DynamicColor;->a(Ljava/lang/String;Ljava/util/function/Function;Ljava/util/function/Function;)Lcom/google/android/material/color/utilities/DynamicColor;

    move-result-object v2

    .line 167
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
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
