﻿// <auto-generated />
using CinemaApi.Data;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

#nullable disable

namespace CinemaApi.Migrations
{
    [DbContext(typeof(CinemaApiContext))]
    [Migration("20241103120427_InitialCreate")]
    partial class InitialCreate
    {
        /// <inheritdoc />
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder.HasAnnotation("ProductVersion", "8.0.10");

            modelBuilder.Entity("CinemaApi.Models.Cinema", b =>
                {
                    b.Property<int>("cinemaId")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("INTEGER");

                    b.Property<string>("cnpj")
                        .HasColumnType("TEXT");

                    b.Property<string>("nome")
                        .HasColumnType("TEXT");

                    b.HasKey("cinemaId");

                    b.ToTable("Cinema");
                });

            modelBuilder.Entity("CinemaApi.Models.Filme", b =>
                {
                    b.Property<int>("filmeId")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("INTEGER");

                    b.Property<int>("ano")
                        .HasColumnType("INTEGER");

                    b.Property<int>("cinemaId")
                        .HasColumnType("INTEGER");

                    b.Property<string>("genero")
                        .HasColumnType("TEXT");

                    b.Property<string>("nome")
                        .HasColumnType("TEXT");

                    b.HasKey("filmeId");

                    b.ToTable("Filme");
                });
#pragma warning restore 612, 618
        }
    }
}