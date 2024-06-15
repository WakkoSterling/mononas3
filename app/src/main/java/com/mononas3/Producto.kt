package com.mononas3
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "productos")
data class Producto(
    @PrimaryKey val codigo: String,
    val nombre: String,
    val descripcion: String,
    val stock35: Int,
    val stock36: Int,
    val stock37: Int,
    val stock38: Int,
    val stock39: Int,
    val stock40: Int,
    val stock41: Int,
    val stock42: Int
)

